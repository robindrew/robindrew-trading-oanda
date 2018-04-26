package com.robindrew.trading.oanda.platform;

import com.oanda.v20.Context;
import com.oanda.v20.account.AccountID;

public interface IOandaSession {

	OandaCredentials getCredentials();

	OandaEnvironment getEnvironment();

	AccountID getAccountId();

	Context getContext();
}
