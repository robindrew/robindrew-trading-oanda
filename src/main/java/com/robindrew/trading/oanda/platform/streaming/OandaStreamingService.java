package com.robindrew.trading.oanda.platform.streaming;

import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.platform.streaming.StreamingService;

public class OandaStreamingService extends StreamingService<IOandaInstrument> {

	@Override
	public boolean subscribe(IOandaInstrument instrument) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean unsubscribe(IOandaInstrument instrument) {
		throw new UnsupportedOperationException();
	}

}
