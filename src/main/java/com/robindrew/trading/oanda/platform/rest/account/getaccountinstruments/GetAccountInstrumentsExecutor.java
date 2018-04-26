package com.robindrew.trading.oanda.platform.rest.account.getaccountinstruments;

import static com.robindrew.common.util.Check.notEmpty;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import com.robindrew.common.json.IJson;
import com.robindrew.trading.oanda.platform.rest.IOandaRestService;
import com.robindrew.trading.oanda.platform.rest.OandaRestExecutor;

public class GetAccountInstrumentsExecutor extends OandaRestExecutor<List<AccountInstrument>> {

	private final String accountId;

	public GetAccountInstrumentsExecutor(IOandaRestService service, String accountId) {
		super(service);
		this.accountId = notEmpty("accountId", accountId);
	}

	@Override
	protected HttpUriRequest createRequest() throws Exception {
		HttpGet request = new HttpGet(getUrl("/v3/accounts/" + accountId + "/instruments"));
		addHeaders(request);
		return request;
	}

	@Override
	protected List<AccountInstrument> handleResponse(IJson json) {
		List<AccountInstrument> list = new ArrayList<>();
		for (IJson element : json.getObjectList("instruments")) {
			list.add(new AccountInstrument(element));
		}
		return list;
	}

}
