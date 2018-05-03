package com.robindrew.trading.oanda.platform.rest;

import java.util.List;

import com.oanda.v20.Context;
import com.oanda.v20.account.AccountGetResponse;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.account.AccountInstrumentsResponse;
import com.oanda.v20.account.AccountProperties;
import com.oanda.v20.account.AccountSummaryResponse;
import com.robindrew.common.util.Check;
import com.robindrew.trading.log.ITransactionLog;
import com.robindrew.trading.oanda.platform.IOandaSession;
import com.robindrew.trading.oanda.platform.OandaException;

public class OandaRestService implements IOandaRestService {

	private final IOandaSession session;
	private final ITransactionLog transactionLog;

	public OandaRestService(IOandaSession session, ITransactionLog transactionLog) {
		this.session = Check.notNull("session", session);
		this.transactionLog = Check.notNull("transactionLog", transactionLog);
	}

	private Context getContext() {
		return getSession().getContext();
	}

	@Override
	public IOandaSession getSession() {
		return session;
	}

	@Override
	public ITransactionLog getTransactionLog() {
		return transactionLog;
	}

	@Override
	public List<AccountProperties> getAccounts() {
		try {
			return getContext().account.list().getAccounts();
		} catch (Exception e) {
			throw new OandaException(e);
		}
	}

	@Override
	public AccountGetResponse getAccountDetails(AccountID id) {
		try {
			return getContext().account.get(id);
		} catch (Exception e) {
			throw new OandaException(e);
		}
	}

	@Override
	public AccountSummaryResponse getAccountSummary(AccountID id) {
		try {
			return getContext().account.summary(id);
		} catch (Exception e) {
			throw new OandaException(e);
		}
	}

	@Override
	public AccountInstrumentsResponse getAccountInstruments(AccountID id) {
		try {
			return getContext().account.instruments(id);
		} catch (Exception e) {
			throw new OandaException(e);
		}
	}

}
