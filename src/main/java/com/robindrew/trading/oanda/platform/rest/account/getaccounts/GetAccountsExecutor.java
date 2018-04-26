package com.robindrew.trading.oanda.platform.rest.account.getaccounts;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import com.robindrew.common.json.IJson;
import com.robindrew.trading.oanda.platform.rest.IOandaRestService;
import com.robindrew.trading.oanda.platform.rest.OandaRestExecutor;

public class GetAccountsExecutor extends OandaRestExecutor<List<Account>> {

	public GetAccountsExecutor(IOandaRestService service) {
		super(service);
	}

	@Override
	protected HttpUriRequest createRequest() throws Exception {
		HttpGet request = new HttpGet(getUrl("/v3/accounts"));
		addHeaders(request);
		return request;
	}

	@Override
	protected List<Account> handleResponse(IJson json) {
		List<Account> list = new ArrayList<>();
		for (IJson element : json.getObjectList("accounts")) {
			list.add(new Account(element));
		}
		return list;
	}

}
