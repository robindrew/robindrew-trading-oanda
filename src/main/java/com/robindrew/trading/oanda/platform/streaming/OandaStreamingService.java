package com.robindrew.trading.oanda.platform.streaming;

import static com.robindrew.trading.provider.TradingProvider.OANDA;

import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.oanda.platform.OandaSession;
import com.robindrew.trading.platform.streaming.AbstractStreamingService;
import com.robindrew.trading.platform.streaming.IInstrumentPriceStream;

public class OandaStreamingService extends AbstractStreamingService<IOandaInstrument> implements IOandaStreamingService {

	private final OandaSession session;
	private StreamingPriceSubscriber subscriber = null;

	public OandaStreamingService(OandaSession session) {
		super(OANDA);
		this.session = session;
	}

	@Override
	public synchronized void close() {
		if (subscriber != null) {
			subscriber.close();
			subscriber = null;
		}
	}

	@Override
	public synchronized boolean subscribe(IOandaInstrument instrument) {
		if (isSubscribed(instrument)) {
			return true;
		}
		newSubscription(instrument);
		return true;
	}

	private synchronized void newSubscription(IOandaInstrument instrument) {
		// For every instrument added or removed, we destroy the previous price subscriber create a new one ...

		// Shutdown the previous subscriber
		if (subscriber != null) {
			subscriber.close();
			subscriber = null;
		}

		// Register the new stream
		registerStream(createStream(instrument));

		// Startup a new subscriber with the additional instrument
		subscriber = new StreamingPriceSubscriber(session, getPriceStreams());
		subscriber.executeAsync();
	}

	private IInstrumentPriceStream<IOandaInstrument> createStream(IOandaInstrument instrument) {
		return new OandaInstrumentPriceStream(instrument);
	}

	@Override
	public synchronized boolean unsubscribe(IOandaInstrument instrument) {
		throw new UnsupportedOperationException();
	}

}
