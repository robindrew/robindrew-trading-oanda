package com.robindrew.trading.oanda.platform;

import com.robindrew.common.util.Check;
import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.platform.TradingPlatform;

public class OandaTradingPlatform extends TradingPlatform<IOandaInstrument> implements IOandaTradingPlatform {

	private final IOandaSession session;

	public OandaTradingPlatform(IOandaSession session) {
		this.session = Check.notNull("session", session);
	}

	public IOandaSession getSession() {
		return session;
	}

}
