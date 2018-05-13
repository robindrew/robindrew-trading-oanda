package com.robindrew.trading.oanda.platform.streaming;

import static com.robindrew.trading.oanda.OandaInstrument.SPOT_EUR_USD;
import static com.robindrew.trading.oanda.OandaInstrument.SPOT_USD_JPY;

import java.util.Set;

import org.junit.Test;

import com.google.common.collect.Sets;
import com.robindrew.common.test.UnitTests;
import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.oanda.platform.OandaCredentials;
import com.robindrew.trading.oanda.platform.OandaEnvironment;
import com.robindrew.trading.oanda.platform.OandaSession;

public class StreamingPriceSubscriberTest {

	@Test
	public void subscribe() {

		String accountId = UnitTests.getProperty("accountId");
		String token = UnitTests.getProperty("token");

		OandaCredentials credentials = new OandaCredentials(accountId, token);
		OandaSession session = new OandaSession(credentials, OandaEnvironment.DEMO);

		Set<IOandaInstrument> instruments = Sets.newHashSet(SPOT_EUR_USD, SPOT_USD_JPY);
		try (StreamingPriceSubscriber subscriber = new StreamingPriceSubscriber(session, instruments)) {
			subscriber.execute();
		}
	}

}
