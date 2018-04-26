package com.robindrew.trading.oanda.platform.rest.order.createorder;

import com.google.gson.Gson;
import com.oanda.v20.order.MarketOrderRequest;

public class CreateOrderRequest {

	public static void main(String[] args) {
		System.out.println(new Gson().toJson(new MarketOrderRequest()));
	}

}
