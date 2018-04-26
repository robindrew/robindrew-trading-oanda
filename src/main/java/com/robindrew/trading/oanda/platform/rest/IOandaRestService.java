package com.robindrew.trading.oanda.platform.rest;

import com.robindrew.trading.log.ITransactionLog;
import com.robindrew.trading.oanda.platform.IOandaSession;

public interface IOandaRestService {

	IOandaSession getSession();

	ITransactionLog getTransactionLog();

}
