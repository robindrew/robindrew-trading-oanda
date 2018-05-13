package com.robindrew.trading.oanda.platform.streaming;

import com.robindrew.trading.oanda.IOandaInstrument;
import com.robindrew.trading.platform.streaming.InstrumentPriceStream;

public class OandaInstrumentPriceStream extends InstrumentPriceStream<IOandaInstrument> {

	public OandaInstrumentPriceStream(IOandaInstrument instrument) {
		super(instrument);
	}

}
