package com.robindrew.trading.oanda.platform.rest.account;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oanda.v20.account.AccountGetResponse;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.account.AccountInstrumentsResponse;
import com.oanda.v20.account.AccountProperties;
import com.oanda.v20.account.AccountSummaryResponse;
import com.oanda.v20.primitives.Instrument;
import com.robindrew.common.text.Strings;
import com.robindrew.trading.log.ITransactionLog;
import com.robindrew.trading.log.StubTransactionLog;
import com.robindrew.trading.oanda.platform.IOandaSession;
import com.robindrew.trading.oanda.platform.OandaCredentials;
import com.robindrew.trading.oanda.platform.OandaEnvironment;
import com.robindrew.trading.oanda.platform.OandaSession;
import com.robindrew.trading.oanda.platform.rest.IOandaRestService;
import com.robindrew.trading.oanda.platform.rest.OandaRestService;

public class AccountTest {

	private static final Logger log = LoggerFactory.getLogger(AccountTest.class);

	@Test
	public void getAccounts() throws Exception {

		String accountId = System.getProperty("accountId");
		String token = System.getProperty("token");
		OandaEnvironment environment = OandaEnvironment.DEMO;

		OandaCredentials credentials = new OandaCredentials(accountId, token);
		IOandaSession session = new OandaSession(credentials, environment);
		ITransactionLog transactionLog = new StubTransactionLog();
		IOandaRestService service = new OandaRestService(session, transactionLog);

		log.info("Session: {}", session);

		for (AccountProperties account : service.getAccounts()) {
			AccountID id = account.getId();

			AccountSummaryResponse summary = service.getAccountSummary(id);
			log.info("Account Summary: {}", Strings.json(summary, true));

			AccountGetResponse details = service.getAccountDetails(id);
			log.info("Account Details: {}", Strings.json(details, true));

			AccountInstrumentsResponse instruments = service.getAccountInstruments(id);
			for (Instrument instrument : instruments.getInstruments()) {
				log.info("Instrument: {}", Strings.json(instrument, true));
			}
		}

	}
}
