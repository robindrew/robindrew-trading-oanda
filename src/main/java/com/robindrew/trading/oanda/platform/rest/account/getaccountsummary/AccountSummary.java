package com.robindrew.trading.oanda.platform.rest.account.getaccountsummary;

import java.math.BigDecimal;

import com.robindrew.common.json.IJson;
import com.robindrew.trading.oanda.platform.rest.OandaRest;

public class AccountSummary {

	private final String guaranteedStopLossOrderMode;
	private final String id;
	private final long createdTime;
	private final String currency;
	private final String createdByUserID;
	private final String alias;
	private final BigDecimal marginRate;
	private final boolean hedgingEnabled;
	private final int lastTransactionID;
	private final int openTradeCount;
	private final int openPositionCount;
	private final int pendingOrderCount;
	private final BigDecimal balance;
	private final BigDecimal pl;
	private final BigDecimal resettablePL;
	private final BigDecimal resettablePLTime;
	private final BigDecimal financing;
	private final BigDecimal commission;
	private final BigDecimal guaranteedExecutionFees;
	private final BigDecimal unrealizedPL;
	private final BigDecimal marginUsed;
	private final BigDecimal marginAvailable;
	private final BigDecimal nav;
	private final BigDecimal positionValue;
	private final BigDecimal marginCloseoutUnrealizedPL;
	private final BigDecimal marginCloseoutNAV;
	private final BigDecimal marginCloseoutMarginUsed;
	private final BigDecimal marginCloseoutPositionValue;
	private final BigDecimal marginCloseoutPercent;
	private final BigDecimal withdrawalLimit;
	private BigDecimal marginCallMarginUsed;
	private BigDecimal marginCallPercent;

	public AccountSummary(IJson json) {
		IJson account = json.getObject("account");
		this.guaranteedStopLossOrderMode = account.get("guaranteedStopLossOrderMode");
		this.id = account.get("id");
		this.createdTime = OandaRest.toMillis(account.get("createdTime"));
		this.currency = account.get("currency");
		this.createdByUserID = account.get("createdByUserID");
		this.alias = account.get("alias");
		this.marginRate = account.getBigDecimal("marginRate");
		this.hedgingEnabled = account.getBoolean("hedgingEnabled");
		this.lastTransactionID = account.getInt("lastTransactionID");

		this.openTradeCount = account.getInt("openTradeCount");
		this.openPositionCount = account.getInt("openPositionCount");
		this.pendingOrderCount = account.getInt("pendingOrderCount");

		this.balance = account.getBigDecimal("balance");
		this.pl = account.getBigDecimal("pl");

		this.resettablePL = account.getBigDecimal("resettablePL");
		this.resettablePLTime = account.getBigDecimal("resettablePLTime");
		this.financing = account.getBigDecimal("financing");
		this.commission = account.getBigDecimal("commission");
		this.guaranteedExecutionFees = account.getBigDecimal("guaranteedExecutionFees");
		this.unrealizedPL = account.getBigDecimal("unrealizedPL");
		this.nav = account.getBigDecimal("NAV");
		this.positionValue = account.getBigDecimal("positionValue");
		this.withdrawalLimit = account.getBigDecimal("withdrawalLimit");

		this.marginUsed = account.getBigDecimal("marginUsed");
		this.marginAvailable = account.getBigDecimal("marginAvailable");

		this.marginCloseoutUnrealizedPL = account.getBigDecimal("marginCloseoutUnrealizedPL");
		this.marginCloseoutNAV = account.getBigDecimal("marginCloseoutNAV");
		this.marginCloseoutMarginUsed = account.getBigDecimal("marginCloseoutMarginUsed");
		this.marginCloseoutPositionValue = account.getBigDecimal("marginCloseoutPositionValue");
		this.marginCloseoutPercent = account.getBigDecimal("marginCloseoutPercent");

		this.marginCallMarginUsed = account.getBigDecimal("marginCallMarginUsed");
		this.marginCallPercent = account.getBigDecimal("marginCallPercent");
	}

	public String getGuaranteedStopLossOrderMode() {
		return guaranteedStopLossOrderMode;
	}

	public String getId() {
		return id;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public String getCurrency() {
		return currency;
	}

	public String getCreatedByUserID() {
		return createdByUserID;
	}

	public String getAlias() {
		return alias;
	}

	public BigDecimal getMarginRate() {
		return marginRate;
	}

	public boolean isHedgingEnabled() {
		return hedgingEnabled;
	}

	public int getLastTransactionID() {
		return lastTransactionID;
	}

	public int getOpenTradeCount() {
		return openTradeCount;
	}

	public int getOpenPositionCount() {
		return openPositionCount;
	}

	public int getPendingOrderCount() {
		return pendingOrderCount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public BigDecimal getPl() {
		return pl;
	}

	public BigDecimal getResettablePL() {
		return resettablePL;
	}

	public BigDecimal getResettablePLTime() {
		return resettablePLTime;
	}

	public BigDecimal getFinancing() {
		return financing;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public BigDecimal getGuaranteedExecutionFees() {
		return guaranteedExecutionFees;
	}

	public BigDecimal getUnrealizedPL() {
		return unrealizedPL;
	}

	public BigDecimal getMarginUsed() {
		return marginUsed;
	}

	public BigDecimal getMarginAvailable() {
		return marginAvailable;
	}

	public BigDecimal getNav() {
		return nav;
	}

	public BigDecimal getPositionValue() {
		return positionValue;
	}

	public BigDecimal getMarginCloseoutUnrealizedPL() {
		return marginCloseoutUnrealizedPL;
	}

	public BigDecimal getMarginCloseoutNAV() {
		return marginCloseoutNAV;
	}

	public BigDecimal getMarginCloseoutMarginUsed() {
		return marginCloseoutMarginUsed;
	}

	public BigDecimal getMarginCloseoutPositionValue() {
		return marginCloseoutPositionValue;
	}

	public BigDecimal getMarginCloseoutPercent() {
		return marginCloseoutPercent;
	}

	public BigDecimal getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public BigDecimal getMarginCallMarginUsed() {
		return marginCallMarginUsed;
	}

	public BigDecimal getMarginCallPercent() {
		return marginCallPercent;
	}

}
