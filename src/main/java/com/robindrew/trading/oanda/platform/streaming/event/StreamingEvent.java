package com.robindrew.trading.oanda.platform.streaming.event;

import java.math.BigDecimal;
import java.util.List;

import com.robindrew.common.text.Strings;
import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.oanda.OandaInstrument;
import com.robindrew.trading.oanda.platform.rest.OandaRest;
import com.robindrew.trading.price.candle.ITickPriceCandle;
import com.robindrew.trading.price.candle.TickPriceCandle;
import com.robindrew.trading.price.precision.IPricePrecision;

public class StreamingEvent {

	public static final String TYPE_PRICE = "PRICE";
	public static final String TYPE_HEARTBEAT = "HEARTBEAT";

	public static class Price {

		private String price;
		private long liquidity;

		public BigDecimal getPrice() {
			return price == null ? null : new BigDecimal(price);
		}

		public long getLiquidity() {
			return liquidity;
		}
	}

	private String type;
	private String time;
	private List<Price> bids;
	private List<Price> asks;
	private String closeoutBid;
	private String closeoutAsk;
	private String status;
	private Boolean tradeable;
	private String instrument;

	public String getType() {
		return type;
	}

	public boolean isPrice() {
		return getType().equals(TYPE_PRICE);
	}

	public boolean isHeartbeat() {
		return getType().equals(TYPE_HEARTBEAT);
	}

	public long getTime() {
		return OandaRest.toMillis(time);
	}

	public List<Price> getBids() {
		return bids;
	}

	public List<Price> getAsks() {
		return asks;
	}

	public BigDecimal getCloseoutBid() {
		return closeoutBid == null ? null : new BigDecimal(closeoutBid);
	}

	public BigDecimal getCloseoutAsk() {
		return closeoutAsk == null ? null : new BigDecimal(closeoutAsk);
	}

	public String getStatus() {
		return status;
	}

	public Boolean getTradeable() {
		return tradeable;
	}

	public String getInstrument() {
		return instrument;
	}

	@Override
	public String toString() {
		return Strings.json(this);
	}

	public IOandaInstrument getOandaInstrument() {
		return OandaInstrument.valueOf(instrument);
	}

	public ITickPriceCandle toTickPriceCandle(IOandaInstrument instrument) {
		IPricePrecision precision = instrument.getPrecision();
		int bidPrice = precision.toBigInt(getCloseoutBid());
		int askPrice = precision.toBigInt(getCloseoutAsk());
		long timestamp = getTime();
		return new TickPriceCandle(bidPrice, askPrice, timestamp, precision.getDecimalPlaces());
	}
}
