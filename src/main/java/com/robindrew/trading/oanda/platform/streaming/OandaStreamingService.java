package com.robindrew.trading.oanda.platform.streaming;

import static com.robindrew.trading.provider.TradingProvider.OANDA;

import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.platform.streaming.AbstractStreamingService;

public class OandaStreamingService extends AbstractStreamingService<IOandaInstrument> {

	public OandaStreamingService() {
		super(OANDA);
	}

	@Override
	public boolean subscribe(IOandaInstrument instrument) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean unsubscribe(IOandaInstrument instrument) {
		throw new UnsupportedOperationException();
	}

}
