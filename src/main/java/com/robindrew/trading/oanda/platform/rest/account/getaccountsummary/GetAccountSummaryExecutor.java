package com.robindrew.trading.oanda.platform.rest.account.getaccountsummary;

import static com.robindrew.common.util.Check.notEmpty;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import com.robindrew.common.json.IJson;
import com.robindrew.trading.oanda.platform.rest.IOandaRestService;
import com.robindrew.trading.oanda.platform.rest.OandaRestExecutor;

public class GetAccountSummaryExecutor extends OandaRestExecutor<AccountSummary> {

	private final String accountId;

	public GetAccountSummaryExecutor(IOandaRestService service, String accountId) {
		super(service);
		this.accountId = notEmpty("accountId", accountId);
	}

	@Override
	protected HttpUriRequest createRequest() throws Exception {
		HttpGet request = new HttpGet(getUrl("/v3/accounts/" + accountId + "/summary"));
		addHeaders(request);
		return request;
	}

	@Override
	protected AccountSummary handleResponse(IJson json) {
		return new AccountSummary(json);
	}

}
