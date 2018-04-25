package com.robindrew.trading.oanda.platform;

import com.robindrew.common.util.Check;

public class OandaCredentials {

	private final String accountId;
	private final String token;

	public OandaCredentials(String accountId, String token) {
		this.accountId = Check.notEmpty("accountId", accountId);
		this.token = Check.notEmpty("token", token);
	}

	public String getAccountId() {
		return accountId;
	}

	public String getToken() {
		return token;
	}

	@Override
	public String toString() {
		return accountId;
	}

}
