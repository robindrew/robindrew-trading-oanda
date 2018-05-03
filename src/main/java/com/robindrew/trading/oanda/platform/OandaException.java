package com.robindrew.trading.oanda.platform;

import com.robindrew.trading.TradingException;

public class OandaException extends TradingException {

	private static final long serialVersionUID = -7941837249524256796L;

	public OandaException(String message) {
		super(message);
	}

	public OandaException(Throwable cause) {
		super(cause);
	}

	public OandaException(String message, Throwable cause) {
		super(message, cause);
	}

}
