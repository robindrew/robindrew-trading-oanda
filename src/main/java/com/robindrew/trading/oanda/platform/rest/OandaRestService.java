package com.robindrew.trading.oanda.platform.rest;

import com.robindrew.common.util.Check;
import com.robindrew.trading.log.ITransactionLog;
import com.robindrew.trading.oanda.platform.IOandaSession;

public class OandaRestService implements IOandaRestService {

	private final IOandaSession session;
	private final ITransactionLog transactionLog;

	public OandaRestService(IOandaSession session, ITransactionLog transactionLog) {
		this.session = Check.notNull("session", session);
		this.transactionLog = Check.notNull("transactionLog", transactionLog);
	}

	@Override
	public IOandaSession getSession() {
		return session;
	}

	@Override
	public ITransactionLog getTransactionLog() {
		return transactionLog;
	}

}
