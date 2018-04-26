package com.robindrew.trading.oanda.platform.rest.account;

import org.junit.Test;

import com.oanda.v20.Context;
import com.oanda.v20.account.AccountProperties;
import com.oanda.v20.account.AccountSummaryResponse;
import com.oanda.v20.primitives.DateTime;
import com.robindrew.common.text.Strings;
import com.robindrew.trading.log.ITransactionLog;
import com.robindrew.trading.log.StubTransactionLog;
import com.robindrew.trading.oanda.platform.IOandaSession;
import com.robindrew.trading.oanda.platform.OandaCredentials;
import com.robindrew.trading.oanda.platform.OandaEnvironment;
import com.robindrew.trading.oanda.platform.OandaSession;
import com.robindrew.trading.oanda.platform.rest.IOandaRestService;
import com.robindrew.trading.oanda.platform.rest.OandaRest;
import com.robindrew.trading.oanda.platform.rest.OandaRestService;

public class AccountTest {

	@Test
	public void getAccounts() throws Exception {

		String accountId = System.getProperty("accountId");
		String token = System.getProperty("token");
		OandaEnvironment environment = OandaEnvironment.DEMO;

		OandaCredentials credentials = new OandaCredentials(accountId, token);
		IOandaSession session = new OandaSession(credentials, environment);
		ITransactionLog transactionLog = new StubTransactionLog();
		IOandaRestService service = new OandaRestService(session, transactionLog);

		Context context = session.getContext();
		for (AccountProperties account : context.account.list().getAccounts()) {
			AccountSummaryResponse summary = context.account.summary(account.getId());
			DateTime date = summary.getAccount().getCreatedTime();
			System.out.println(OandaRest.toMillis(date));
		}

	}
}
