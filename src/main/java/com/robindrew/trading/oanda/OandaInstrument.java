package com.robindrew.trading.oanda;

import static com.robindrew.trading.Instruments.EUR_USD;
import static com.robindrew.trading.Instruments.USD_JPY;

import com.robindrew.trading.IInstrument;
import com.robindrew.trading.Instrument;

public class OandaInstrument extends Instrument implements IOandaInstrument {

	/** EUR/USD. */
	public static final OandaInstrument SPOT_EUR_USD = new OandaInstrument("EUR_USD", EUR_USD);
	/** USD/JPY. */
	public static final OandaInstrument SPOT_USD_JPY = new OandaInstrument("USD_JPY", USD_JPY);

	public OandaInstrument(String name, IInstrument underlying) {
		super(name, underlying);
	}

}
