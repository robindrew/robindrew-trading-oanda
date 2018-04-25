package com.robindrew.trading.oanda.platform;

import com.robindrew.common.util.Check;

public class OandaSession {

	private final OandaCredentials credentials;
	private final OandaEnvironment environment;

	public OandaSession(OandaCredentials credentials, OandaEnvironment environment) {
		this.credentials = Check.notNull("credentials", credentials);
		this.environment = Check.notNull("environment", environment);
	}

	public OandaCredentials getCredentials() {
		return credentials;
	}

	public OandaEnvironment getEnvironment() {
		return environment;
	}

}
