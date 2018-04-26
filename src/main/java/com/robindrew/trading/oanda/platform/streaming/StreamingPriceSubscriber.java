package com.robindrew.trading.oanda.platform.streaming;

import static com.google.common.collect.ImmutableList.copyOf;
import static com.robindrew.common.io.BufferedReaderIterable.lines;
import static com.robindrew.common.util.Check.notEmpty;

import java.io.InputStream;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robindrew.common.util.Check;
import com.robindrew.common.util.Quietly;
import com.robindrew.trading.httpclient.HttpClientException;
import com.robindrew.trading.httpclient.HttpClientExecutor;
import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.oanda.platform.OandaSession;

public class StreamingPriceSubscriber extends HttpClientExecutor<Boolean> implements AutoCloseable {

	private static final Logger log = LoggerFactory.getLogger(StreamingPriceSubscriber.class);

	private final OandaSession session;
	private final Collection<? extends IOandaInstrument> instruments;

	private final AtomicBoolean closed = new AtomicBoolean(false);
	private volatile InputStream stream = null;

	public StreamingPriceSubscriber(OandaSession session, Collection<? extends IOandaInstrument> instruments) {
		this.session = Check.notNull("session", session);
		this.instruments = copyOf(notEmpty("instruments", instruments));
	}

	@Override
	public void close() {
		if (closed.compareAndSet(false, true)) {
			if (stream != null) {
				Quietly.close(stream);
				stream = null;
			}
		}
	}

	@Override
	public HttpUriRequest createRequest() {

		// URL
		String url = getUrl(instruments);
		log.info("[Subscribing] {}", url);

		// Request
		HttpGet request = new HttpGet(url);
		request.addHeader("Authorization", "Bearer " + session.getCredentials().getToken());
		request.addHeader("Accept-Datetime-Format", "UNIX");
		return request;
	}

	protected boolean failed(HttpUriRequest request, HttpResponse response) {
		return response.getStatusLine().getStatusCode() != 200 || response.getEntity() == null;
	}

	private String getUrl(Collection<? extends IOandaInstrument> instruments) {
		StringBuilder url = new StringBuilder();
		url.append(session.getEnvironment().getStreamDomain());
		url.append("/v3/accounts/");
		url.append(session.getCredentials().getAccountId());
		url.append("/pricing/stream?instruments=");

		boolean comma = false;
		for (IOandaInstrument instrument : instruments) {
			if (comma) {
				url.append(',');
			}
			url.append(instrument.getName());
			comma = true;
		}
		return url.toString();
	}

	@Override
	protected Boolean handleResponse(HttpUriRequest request, HttpResponse response) throws Exception {
		HttpEntity entity = response.getEntity();

		// Failed?
		if (response.getStatusLine().getStatusCode() != 200 || entity == null) {
			String message = entity == null ? response.getStatusLine().toString() : EntityUtils.toString(entity, "UTF-8");
			throw new HttpClientException(message);
		}

		// Handle the prices
		handlePrices(entity);
		return null;
	}

	private void handlePrices(HttpEntity entity) throws Exception {
		stream = entity.getContent();
		for (String line : lines(stream)) {
			handlePrice(line);
		}
	}

	private void handlePrice(String line) {
		if (!line.contains("PRICE")) {
			return;
		}

		System.out.println(line);
	}

}
