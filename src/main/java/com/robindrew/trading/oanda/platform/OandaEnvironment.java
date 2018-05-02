package com.robindrew.trading.oanda.platform;

public enum OandaEnvironment {

	/** Prod Environment. */
	PROD("https://api-fxtrade.oanda.com", "https://stream-fxtrade.oanda.com"),
	/** Demo Environment. */
	DEMO("https://api-fxpractice.oanda.com", "https://stream-fxpractice.oanda.com");

	private final String restUrl;
	private final String streamUrl;

	private OandaEnvironment(String restUrl, String streamUrl) {
		this.restUrl = restUrl;
		this.streamUrl = streamUrl;
	}

	public String getStreamUrl() {
		return streamUrl;
	}

	public String getRestUrl() {
		return restUrl;
	}

}
