package com.robindrew.trading.oanda.platform.rest;

import static com.robindrew.common.http.MimeType.APPLICATION_JSON;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;

import com.google.common.base.Charsets;
import com.google.gson.Gson;
import com.robindrew.common.json.Gsons;
import com.robindrew.common.json.IJson;
import com.robindrew.common.util.Check;
import com.robindrew.trading.httpclient.HttpClientException;
import com.robindrew.trading.httpclient.HttpClientExecutor;
import com.robindrew.trading.httpclient.HttpClients;
import com.robindrew.trading.log.ITransactionLog;
import com.robindrew.trading.oanda.platform.IOandaSession;

public abstract class OandaRestExecutor<R> extends HttpClientExecutor<R> {

	private final IOandaRestService service;

	protected OandaRestExecutor(IOandaRestService service) {
		this.service = Check.notNull("service", service);;
	}

	public String getName() {
		String name = getClass().getSimpleName();
		if (name.endsWith("Executor")) {
			name = name.substring(0, name.length() - "Executor".length());
		}
		return name;
	}

	public IOandaSession getSession() {
		return service.getSession();
	}

	public ITransactionLog getTransactionLog() {
		return service.getTransactionLog();
	}

	protected String getUrl(String path) {
		if (!path.startsWith("/")) {
			throw new IllegalArgumentException("path: '" + path + "'");
		}
		return getSession().getEnvironment().getRestDomain() + path;
	}

	protected void addHeaders(HttpUriRequest request) {
		request.addHeader("Authorization", "Bearer " + getSession().getCredentials().getToken());
		request.addHeader("Accept-Datetime-Format", "UNIX");
	}

	protected void setJsonContent(HttpEntityEnclosingRequestBase request, Object object) {
		String json = new Gson().toJson(object);
		StringEntity entity = new StringEntity(json, Charsets.UTF_8);
		entity.setContentType(APPLICATION_JSON.getType());
		request.setEntity(entity);
	}

	@Override
	protected R handleResponse(HttpUriRequest request, HttpResponse response) throws Exception {

		// Not OK?
		if (!isSuccess(response)) {
			throw new HttpClientException(response.getStatusLine().toString());
		}

		HttpEntity entity = response.getEntity();
		String content = HttpClients.getTextContent(entity);
		IJson json = Gsons.parseJson(content);

		return handleResponse(json);
	}

	protected boolean isSuccess(HttpResponse response) {
		return response.getStatusLine().getStatusCode() == 200 && response.getEntity() != null;
	}

	protected abstract R handleResponse(IJson json);

}
