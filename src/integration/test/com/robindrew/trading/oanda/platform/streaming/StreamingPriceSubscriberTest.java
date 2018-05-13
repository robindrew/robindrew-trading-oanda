package com.robindrew.trading.oanda.platform.streaming;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.robindrew.common.test.UnitTests;
import com.robindrew.common.util.Threads;
import com.robindrew.trading.oanda.OandaInstrument;
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

		try (IOandaStreamingService service = new OandaStreamingService(session)) {
			service.subscribe(OandaInstrument.SPOT_EUR_JPY);
			service.subscribe(OandaInstrument.SPOT_EUR_USD);
			service.subscribe(OandaInstrument.SPOT_GBP_USD);
			service.subscribe(OandaInstrument.SPOT_AUD_USD);

			Threads.sleep(1, TimeUnit.MINUTES);
			service.subscribe(OandaInstrument.SPOT_USD_JPY);

			Threads.sleep(1, TimeUnit.MINUTES);
		}
	}

}
