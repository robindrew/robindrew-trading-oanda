package com.robindrew.trading.oanda.platform.rest.account.getaccountinstruments;

import java.math.BigDecimal;

import com.robindrew.common.json.IJson;

public class AccountInstrument implements Comparable<AccountInstrument> {

	private final String name;
	private final String type;
	private final String displayName;
	private final int pipLocation;
	private final int displayPrecision;
	private final int tradeUnitsPrecision;
	private final int minimumTradeSize;
	private final BigDecimal maximumTrailingStopDistance;
	private final BigDecimal minimumTrailingStopDistance;
	private final BigDecimal maximumPositionSize;
	private final int maximumOrderUnits;
	private final BigDecimal marginRate;

	public AccountInstrument(IJson json) {
		this.name = json.get("name");
		this.type = json.get("type");
		this.displayName = json.get("displayName");
		this.pipLocation = json.getInt("pipLocation");
		this.displayPrecision = json.getInt("displayPrecision");
		this.tradeUnitsPrecision = json.getInt("tradeUnitsPrecision");
		this.minimumTradeSize = json.getInt("minimumTradeSize");
		this.maximumTrailingStopDistance = json.getBigDecimal("maximumTrailingStopDistance");
		this.minimumTrailingStopDistance = json.getBigDecimal("minimumTrailingStopDistance");
		this.maximumPositionSize = json.getBigDecimal("maximumPositionSize");
		this.maximumOrderUnits = json.getInt("maximumOrderUnits");
		this.marginRate = json.getBigDecimal("marginRate");
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getDisplayName() {
		return displayName;
	}

	public int getPipLocation() {
		return pipLocation;
	}

	public int getDisplayPrecision() {
		return displayPrecision;
	}

	public int getTradeUnitsPrecision() {
		return tradeUnitsPrecision;
	}

	public int getMinimumTradeSize() {
		return minimumTradeSize;
	}

	public BigDecimal getMaximumTrailingStopDistance() {
		return maximumTrailingStopDistance;
	}

	public BigDecimal getMinimumTrailingStopDistance() {
		return minimumTrailingStopDistance;
	}

	public BigDecimal getMaximumPositionSize() {
		return maximumPositionSize;
	}

	public int getMaximumOrderUnits() {
		return maximumOrderUnits;
	}

	public BigDecimal getMarginRate() {
		return marginRate;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(AccountInstrument that) {
		return this.getName().compareTo(that.getName());
	}

}
