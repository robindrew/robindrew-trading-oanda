package com.robindrew.trading.oanda.platform.streaming;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.price.candle.ITickPriceCandle;

public class JsonParsingTest {

	private final Gson gson = new GsonBuilder().disableHtmlEscaping().serializeNulls().create();

	@Test
	public void parsePrice() {
		String json = "{\"type\":\"PRICE\",\"time\":\"1525466917.721604381\",\"bids\":[{\"price\":\"109.078\",\"liquidity\":10000000}],\"asks\":[{\"price\":\"109.098\",\"liquidity\":10000000}],\"closeoutBid\":\"109.063\",\"closeoutAsk\":\"109.113\",\"status\":\"tradeable\",\"tradeable\":true,\"instrument\":\"USD_JPY\"}";

		StreamingPriceTick object = gson.fromJson(json, StreamingPriceTick.class);
		String toJson = gson.toJson(object);

		Assert.assertEquals(json, toJson);

		IOandaInstrument instrument = object.getOandaInstrument();
		ITickPriceCandle candle = object.toTickPriceCandle(instrument);

		Assert.assertEquals(1525466917721l, candle.getTimestamp());
		Assert.assertEquals(1090630, candle.getBidPrice());
		Assert.assertEquals(1091130, candle.getAskPrice());
		Assert.assertEquals(instrument.getPrecision().getDecimalPlaces(), candle.getDecimalPlaces());
	}

}
