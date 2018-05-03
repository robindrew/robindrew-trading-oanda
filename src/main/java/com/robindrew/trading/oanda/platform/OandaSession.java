package com.robindrew.trading.oanda.platform;

import com.oanda.v20.Context;
import com.oanda.v20.account.AccountID;
import com.robindrew.common.util.Check;

public class OandaSession implements IOandaSession {

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

	public AccountID getAccountId() {
		return new AccountID(credentials.getAccountId());
	}

	public Context getContext() {
		return new Context(environment.getRestDomain(), credentials.getToken());
	}

	@Override
	public String toString() {
		return credentials + "[" + environment + "]";
	}
}
