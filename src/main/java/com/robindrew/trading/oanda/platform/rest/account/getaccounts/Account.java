package com.robindrew.trading.oanda.platform.rest.account.getaccounts;

import com.robindrew.common.json.IJson;

public class Account {

	private final String id;

	public Account(IJson json) {
		this.id = json.get("id");
	}

	public String getId() {
		return id;
	}

}
