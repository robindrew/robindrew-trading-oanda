package com.robindrew.trading.oanda.platform;

import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.oanda.platform.streaming.IOandaStreamingService;
import com.robindrew.trading.platform.ITradingPlatform;

public interface IOandaTradingPlatform extends ITradingPlatform<IOandaInstrument> {

	@Override
	IOandaStreamingService getStreamingService();

}
