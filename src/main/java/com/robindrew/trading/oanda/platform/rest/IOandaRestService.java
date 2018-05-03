package com.robindrew.trading.oanda.platform.rest;

import java.util.List;

import com.oanda.v20.account.AccountGetResponse;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.account.AccountInstrumentsResponse;
import com.oanda.v20.account.AccountProperties;
import com.oanda.v20.account.AccountSummaryResponse;
import com.robindrew.trading.log.ITransactionLog;
import com.robindrew.trading.oanda.platform.IOandaSession;

public interface IOandaRestService {

	IOandaSession getSession();

	ITransactionLog getTransactionLog();

	List<AccountProperties> getAccounts();

	AccountSummaryResponse getAccountSummary(AccountID id);

	AccountInstrumentsResponse getAccountInstruments(AccountID id);

	AccountGetResponse getAccountDetails(AccountID id);

}
