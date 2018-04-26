package com.robindrew.trading.oanda.platform.rest.order.createorder;

import static com.robindrew.common.util.Check.notEmpty;
import static com.robindrew.common.util.Check.notNull;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;

import com.robindrew.common.json.IJson;
import com.robindrew.trading.oanda.platform.rest.IOandaRestService;
import com.robindrew.trading.oanda.platform.rest.OandaRestExecutor;
import com.robindrew.trading.position.order.IPositionOrder;

public class CreateOrderExecutor extends OandaRestExecutor<Boolean> {

	private final String accountId;
	private final IPositionOrder order;

	public CreateOrderExecutor(IOandaRestService service, String accountId, IPositionOrder order) {
		super(service);
		this.accountId = notEmpty("accountId", accountId);
		this.order = notNull("order", order);
	}

	protected boolean isSuccess(HttpResponse response) {
		return response.getStatusLine().getStatusCode() == 201 && response.getEntity() != null;
	}

	@Override
	protected HttpUriRequest createRequest() throws Exception {
		HttpPost request = new HttpPost(getUrl("/v3/accounts/" + accountId + "/orders"));
		addHeaders(request);
		setJsonContent(request, new CreateOrderRequest());
		return request;
	}

	@Override
	protected Boolean handleResponse(IJson json) {
		System.out.println(json);
		return true;
	}

}
