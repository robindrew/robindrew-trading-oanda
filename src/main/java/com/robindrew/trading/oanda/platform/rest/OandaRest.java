package com.robindrew.trading.oanda.platform.rest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.oanda.v20.primitives.DateTime;
import com.robindrew.common.date.Dates;

public class OandaRest {

	public static final long toMillis(String secondNanoTime) {

		int dotIndex = secondNanoTime.indexOf('.');
		if (dotIndex == -1) {
			return Long.parseLong(secondNanoTime);
		}

		long seconds = Long.parseLong(secondNanoTime.substring(0, dotIndex));
		long nanos = Long.parseLong(secondNanoTime.substring(dotIndex + 1));
		long millis = (nanos / 1000000);

		return (seconds * 1000) + millis;
	}
	
	public static final long toMillis(DateTime date) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.n'Z'");
		LocalDateTime localDate = LocalDateTime.parse(date.toString(), format);
		return Dates.toMillis(localDate);
	}

}
