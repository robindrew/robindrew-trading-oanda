package com.robindrew.trading.oanda.platform;

public enum OandaEnvironment {

	/** Prod Environment. */
	PROD("https://api-fxtrade.oanda.com", "https://stream-fxtrade.oanda.com"),
	/** Demo Environment. */
	DEMO("https://api-fxpractice.oanda.com", "https://stream-fxpractice.oanda.com");

	private final String restDomain;
	private final String streamDomain;

	private OandaEnvironment(String restDomain, String streamDomain) {
		this.restDomain = restDomain;
		this.streamDomain = streamDomain;
	}

	public String getStreamDomain() {
		return streamDomain;
	}

	public String getRestDomain() {
		return restDomain;
	}

}
