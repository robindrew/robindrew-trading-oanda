package com.robindrew.trading.oanda.platform;

import com.robindrew.common.util.Check;
import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.oanda.platform.streaming.IOandaStreamingService;
import com.robindrew.trading.oanda.platform.streaming.OandaStreamingService;
import com.robindrew.trading.platform.TradingPlatform;

public class OandaTradingPlatform extends TradingPlatform<IOandaInstrument> implements IOandaTradingPlatform {

	private final IOandaSession session;
	private final IOandaStreamingService streaming;

	public OandaTradingPlatform(IOandaSession session) {
		this.session = Check.notNull("session", session);
		this.streaming = new OandaStreamingService(session);
	}

	public IOandaSession getSession() {
		return session;
	}

	@Override
	public IOandaStreamingService getStreamingService() {
		return streaming;
	}
}
