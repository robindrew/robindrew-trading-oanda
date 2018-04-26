package com.robindrew.trading.oanda;

import static com.robindrew.trading.Instruments.*;

import com.robindrew.trading.IInstrument;
import com.robindrew.trading.Instrument;

public class OandaInstrument extends Instrument implements IOandaInstrument {

	/** AUD/CAD (CURRENCY). */
	public static final OandaInstrument SPOT_AUD_CAD = new OandaInstrument("AUD_CAD", AUD_CAD);
	/** AUD/CHF (CURRENCY). */
	public static final OandaInstrument SPOT_AUD_CHF = new OandaInstrument("AUD_CHF", AUD_CHF);
	/** AUD/HKD (CURRENCY). */
	public static final OandaInstrument SPOT_AUD_HKD = new OandaInstrument("AUD_HKD", AUD_HKD);
	/** AUD/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_AUD_JPY = new OandaInstrument("AUD_JPY", AUD_JPY);
	/** AUD/NZD (CURRENCY). */
	public static final OandaInstrument SPOT_AUD_NZD = new OandaInstrument("AUD_NZD", AUD_NZD);
	/** AUD/SGD (CURRENCY). */
	public static final OandaInstrument SPOT_AUD_SGD = new OandaInstrument("AUD_SGD", AUD_SGD);
	/** AUD/USD (CURRENCY). */
	public static final OandaInstrument SPOT_AUD_USD = new OandaInstrument("AUD_USD", AUD_USD);

	/** CAD/CHF (CURRENCY). */
	public static final OandaInstrument SPOT_CAD_CHF = new OandaInstrument("CAD_CHF", CAD_CHF);
	/** CAD/HKD (CURRENCY). */
	public static final OandaInstrument SPOT_CAD_HKD = new OandaInstrument("CAD_HKD", CAD_HKD);
	/** CAD/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_CAD_JPY = new OandaInstrument("CAD_JPY", CAD_JPY);
	/** CAD/SGD (CURRENCY). */
	public static final OandaInstrument SPOT_CAD_SGD = new OandaInstrument("CAD_SGD", CAD_SGD);

	/** CHF/HKD (CURRENCY). */
	public static final OandaInstrument SPOT_CHF_HKD = new OandaInstrument("CHF_HKD", CHF_HKD);
	/** CHF/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_CHF_JPY = new OandaInstrument("CHF_JPY", CHF_JPY);
	/** CHF/ZAR (CURRENCY). */
	public static final OandaInstrument SPOT_CHF_ZAR = new OandaInstrument("CHF_ZAR", CHF_ZAR);

	/** EUR/AUD (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_AUD = new OandaInstrument("EUR_AUD", EUR_AUD);
	/** EUR/CAD (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_CAD = new OandaInstrument("EUR_CAD", EUR_CAD);
	/** EUR/CHF (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_CHF = new OandaInstrument("EUR_CHF", EUR_CHF);
	/** EUR/CZK (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_CZK = new OandaInstrument("EUR_CZK", EUR_CZK);
	/** EUR/DKK (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_DKK = new OandaInstrument("EUR_DKK", EUR_DKK);
	/** EUR/GBP (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_GBP = new OandaInstrument("EUR_GBP", EUR_GBP);
	/** EUR/HKD (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_HKD = new OandaInstrument("EUR_HKD", EUR_HKD);
	/** EUR/HUF (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_HUF = new OandaInstrument("EUR_HUF", EUR_HUF);
	/** EUR/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_JPY = new OandaInstrument("EUR_JPY", EUR_JPY);
	/** EUR/NOK (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_NOK = new OandaInstrument("EUR_NOK", EUR_NOK);
	/** EUR/NZD (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_NZD = new OandaInstrument("EUR_NZD", EUR_NZD);
	/** EUR/PLN (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_PLN = new OandaInstrument("EUR_PLN", EUR_PLN);
	/** EUR/SEK (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_SEK = new OandaInstrument("EUR_SEK", EUR_SEK);
	/** EUR/SGD (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_SGD = new OandaInstrument("EUR_SGD", EUR_SGD);
	/** EUR/TRY (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_TRY = new OandaInstrument("EUR_TRY", EUR_TRY);
	/** EUR/USD (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_USD = new OandaInstrument("EUR_USD", EUR_USD);
	/** EUR/ZAR (CURRENCY). */
	public static final OandaInstrument SPOT_EUR_ZAR = new OandaInstrument("EUR_ZAR", EUR_ZAR);

	/** GBP/AUD (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_AUD = new OandaInstrument("GBP_AUD", GBP_AUD);
	/** GBP/CAD (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_CAD = new OandaInstrument("GBP_CAD", GBP_CAD);
	/** GBP/CHF (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_CHF = new OandaInstrument("GBP_CHF", GBP_CHF);
	/** GBP/HKD (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_HKD = new OandaInstrument("GBP_HKD", GBP_HKD);
	/** GBP/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_JPY = new OandaInstrument("GBP_JPY", GBP_JPY);
	/** GBP/NZD (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_NZD = new OandaInstrument("GBP_NZD", GBP_NZD);
	/** GBP/PLN (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_PLN = new OandaInstrument("GBP_PLN", GBP_PLN);
	/** GBP/SGD (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_SGD = new OandaInstrument("GBP_SGD", GBP_SGD);
	/** GBP/USD (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_USD = new OandaInstrument("GBP_USD", GBP_USD);
	/** GBP/ZAR (CURRENCY). */
	public static final OandaInstrument SPOT_GBP_ZAR = new OandaInstrument("GBP_ZAR", GBP_ZAR);

	/** HKD/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_HKD_JPY = new OandaInstrument("HKD_JPY", HKD_JPY);

	/** NZD/CAD (CURRENCY). */
	public static final OandaInstrument SPOT_NZD_CAD = new OandaInstrument("NZD_CAD", NZD_CAD);
	/** NZD/CHF (CURRENCY). */
	public static final OandaInstrument SPOT_NZD_CHF = new OandaInstrument("NZD_CHF", NZD_CHF);
	/** NZD/HKD (CURRENCY). */
	public static final OandaInstrument SPOT_NZD_HKD = new OandaInstrument("NZD_HKD", NZD_HKD);
	/** NZD/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_NZD_JPY = new OandaInstrument("NZD_JPY", NZD_JPY);
	/** NZD/SGD (CURRENCY). */
	public static final OandaInstrument SPOT_NZD_SGD = new OandaInstrument("NZD_SGD", NZD_SGD);
	/** NZD/USD (CURRENCY). */
	public static final OandaInstrument SPOT_NZD_USD = new OandaInstrument("NZD_USD", NZD_USD);

	/** SGD/CHF (CURRENCY). */
	public static final OandaInstrument SPOT_SGD_CHF = new OandaInstrument("SGD_CHF", SGD_CHF);
	/** SGD/HKD (CURRENCY). */
	public static final OandaInstrument SPOT_SGD_HKD = new OandaInstrument("SGD_HKD", SGD_HKD);
	/** SGD/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_SGD_JPY = new OandaInstrument("SGD_JPY", SGD_JPY);

	/** TRY/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_TRY_JPY = new OandaInstrument("TRY_JPY", TRY_JPY);

	/** USD/CAD (CURRENCY). */
	public static final OandaInstrument SPOT_USD_CAD = new OandaInstrument("USD_CAD", USD_CAD);
	/** USD/CHF (CURRENCY). */
	public static final OandaInstrument SPOT_USD_CHF = new OandaInstrument("USD_CHF", USD_CHF);
	/** USD/CNH (CURRENCY). */
	public static final OandaInstrument SPOT_USD_CNH = new OandaInstrument("USD_CNH", USD_CNH);
	/** USD/CZK (CURRENCY). */
	public static final OandaInstrument SPOT_USD_CZK = new OandaInstrument("USD_CZK", USD_CZK);
	/** USD/DKK (CURRENCY). */
	public static final OandaInstrument SPOT_USD_DKK = new OandaInstrument("USD_DKK", USD_DKK);
	/** USD/HKD (CURRENCY). */
	public static final OandaInstrument SPOT_USD_HKD = new OandaInstrument("USD_HKD", USD_HKD);
	/** USD/HUF (CURRENCY). */
	public static final OandaInstrument SPOT_USD_HUF = new OandaInstrument("USD_HUF", USD_HUF);
	/** USD/INR (CURRENCY). */
	public static final OandaInstrument SPOT_USD_INR = new OandaInstrument("USD_INR", USD_INR);
	/** USD/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_USD_JPY = new OandaInstrument("USD_JPY", USD_JPY);
	/** USD/MXN (CURRENCY). */
	public static final OandaInstrument SPOT_USD_MXN = new OandaInstrument("USD_MXN", USD_MXN);
	/** USD/NOK (CURRENCY). */
	public static final OandaInstrument SPOT_USD_NOK = new OandaInstrument("USD_NOK", USD_NOK);
	/** USD/PLN (CURRENCY). */
	public static final OandaInstrument SPOT_USD_PLN = new OandaInstrument("USD_PLN", USD_PLN);
	/** USD/SAR (CURRENCY). */
	public static final OandaInstrument SPOT_USD_SAR = new OandaInstrument("USD_SAR", USD_SAR);
	/** USD/SEK (CURRENCY). */
	public static final OandaInstrument SPOT_USD_SEK = new OandaInstrument("USD_SEK", USD_SEK);
	/** USD/SGD (CURRENCY). */
	public static final OandaInstrument SPOT_USD_SGD = new OandaInstrument("USD_SGD", USD_SGD);
	/** USD/THB (CURRENCY). */
	public static final OandaInstrument SPOT_USD_THB = new OandaInstrument("USD_THB", USD_THB);
	/** USD/TRY (CURRENCY). */
	public static final OandaInstrument SPOT_USD_TRY = new OandaInstrument("USD_TRY", USD_TRY);
	/** USD/ZAR (CURRENCY). */
	public static final OandaInstrument SPOT_USD_ZAR = new OandaInstrument("USD_ZAR", USD_ZAR);

	/** ZAR/JPY (CURRENCY). */
	public static final OandaInstrument SPOT_ZAR_JPY = new OandaInstrument("ZAR_JPY", ZAR_JPY);

	/** Silver/AUD (METAL). */
	public static final OandaInstrument SPOT_XAG_AUD = new OandaInstrument("XAG_AUD", XAG_AUD);
	/** Silver/CAD (METAL). */
	public static final OandaInstrument SPOT_XAG_CAD = new OandaInstrument("XAG_CAD", XAG_CAD);
	/** Silver/CHF (METAL). */
	public static final OandaInstrument SPOT_XAG_CHF = new OandaInstrument("XAG_CHF", XAG_CHF);
	/** Silver/EUR (METAL). */
	public static final OandaInstrument SPOT_XAG_EUR = new OandaInstrument("XAG_EUR", XAG_EUR);
	/** Silver/GBP (METAL). */
	public static final OandaInstrument SPOT_XAG_GBP = new OandaInstrument("XAG_GBP", XAG_GBP);
	/** Silver/HKD (METAL). */
	public static final OandaInstrument SPOT_XAG_HKD = new OandaInstrument("XAG_HKD", XAG_HKD);
	/** Silver/JPY (METAL). */
	public static final OandaInstrument SPOT_XAG_JPY = new OandaInstrument("XAG_JPY", XAG_JPY);
	/** Silver/NZD (METAL). */
	public static final OandaInstrument SPOT_XAG_NZD = new OandaInstrument("XAG_NZD", XAG_NZD);
	/** Silver/SGD (METAL). */
	public static final OandaInstrument SPOT_XAG_SGD = new OandaInstrument("XAG_SGD", XAG_SGD);
	/** Silver (METAL). */
	public static final OandaInstrument SPOT_XAG_USD = new OandaInstrument("XAG_USD", XAG_USD);

	/** Gold/AUD (METAL). */
	public static final OandaInstrument SPOT_XAU_AUD = new OandaInstrument("XAU_AUD", XAU_AUD);
	/** Gold/CAD (METAL). */
	public static final OandaInstrument SPOT_XAU_CAD = new OandaInstrument("XAU_CAD", XAU_CAD);
	/** Gold/CHF (METAL). */
	public static final OandaInstrument SPOT_XAU_CHF = new OandaInstrument("XAU_CHF", XAU_CHF);
	/** Gold/EUR (METAL). */
	public static final OandaInstrument SPOT_XAU_EUR = new OandaInstrument("XAU_EUR", XAU_EUR);
	/** Gold/GBP (METAL). */
	public static final OandaInstrument SPOT_XAU_GBP = new OandaInstrument("XAU_GBP", XAU_GBP);
	/** Gold/HKD (METAL). */
	public static final OandaInstrument SPOT_XAU_HKD = new OandaInstrument("XAU_HKD", XAU_HKD);
	/** Gold/JPY (METAL). */
	public static final OandaInstrument SPOT_XAU_JPY = new OandaInstrument("XAU_JPY", XAU_JPY);
	/** Gold/NZD (METAL). */
	public static final OandaInstrument SPOT_XAU_NZD = new OandaInstrument("XAU_NZD", XAU_NZD);
	/** Gold/SGD (METAL). */
	public static final OandaInstrument SPOT_XAU_SGD = new OandaInstrument("XAU_SGD", XAU_SGD);
	/** Gold (METAL). */
	public static final OandaInstrument SPOT_XAU_USD = new OandaInstrument("XAU_USD", XAU_USD);
	/** Gold/Silver (METAL). */
	public static final OandaInstrument SPOT_XAU_XAG = new OandaInstrument("XAU_XAG", XAU_XAG);

	/** Palladium (METAL). */
	public static final OandaInstrument SPOT_XPD_USD = new OandaInstrument("XPD_USD", XPD_USD);
	/** Platinum (METAL). */
	public static final OandaInstrument SPOT_XPT_USD = new OandaInstrument("XPT_USD", XPT_USD);

	/** Australia 200 (CFD). */
	public static final OandaInstrument CFD_AU200_AUD = new OandaInstrument("AU200_AUD", ASX_200);
	/** China A50 (CFD). */
	public static final OandaInstrument CFD_CN50_USD = new OandaInstrument("CN50_USD", CHINA_A50);
	/** Germany 30 (CFD). */
	public static final OandaInstrument CFD_DE30_EUR = new OandaInstrument("DE30_EUR", DAX_30);
	/** Europe 50 (CFD). */
	public static final OandaInstrument CFD_EU50_EUR = new OandaInstrument("EU50_EUR", EURO_STOXX_50);
	/** France 40 (CFD). */
	public static final OandaInstrument CFD_FR40_EUR = new OandaInstrument("FR40_EUR", CAC_40);
	/** Hong Kong 33 (CFD). */
	public static final OandaInstrument CFD_HK33_HKD = new OandaInstrument("HK33_HKD", HANG_SENG_33);
	/** India 50 (CFD). */
	public static final OandaInstrument CFD_IN50_USD = new OandaInstrument("IN50_USD", NIFTY_50);
	/** Japan 225 (CFD). */
	public static final OandaInstrument CFD_JP225_USD = new OandaInstrument("JP225_USD", NIKKEI_225);
	/** US Nas 100 (CFD). */
	public static final OandaInstrument CFD_NAS100_USD = new OandaInstrument("NAS100_USD", NASDAQ_100);
	/** Netherlands 25 (CFD). */
	public static final OandaInstrument CFD_NL25_EUR = new OandaInstrument("NL25_EUR", AEX_25);
	/** Singapore 30 (CFD). */
	public static final OandaInstrument CFD_SG30_SGD = new OandaInstrument("SG30_SGD", STRAITS_TIMES_30);
	/** US SPX 500 (CFD). */
	public static final OandaInstrument CFD_SPX500_USD = new OandaInstrument("SPX500_USD", SP_500);
	/** Taiwan Index (CFD). */
	public static final OandaInstrument CFD_TWIX_USD = new OandaInstrument("TWIX_USD", TAIEX);
	/** UK 100 (CFD). */
	public static final OandaInstrument CFD_UK100_GBP = new OandaInstrument("UK100_GBP", FTSE_100);
	/** US Wall St 30 (CFD). */
	public static final OandaInstrument CFD_US30_USD = new OandaInstrument("US30_USD", DOW_JONES_30);
	/** US Russ 2000 (CFD). */
	public static final OandaInstrument CFD_US2000_USD = new OandaInstrument("US2000_USD", RUSSELL_2000);

	/** Bund (CFD). */
	public static final OandaInstrument CFD_DE10YB_EUR = new OandaInstrument("DE10YB_EUR", DE_BUND_10Y);
	/** UK 10Y Gilt (CFD). */
	public static final OandaInstrument CFD_UK10YB_GBP = new OandaInstrument("UK10YB_GBP", UK_GILT_10Y);
	/** US 2Y T-Note (CFD). */
	public static final OandaInstrument CFD_USB02Y_USD = new OandaInstrument("USB02Y_USD", US_TNOTE_2Y);
	/** US 5Y T-Note (CFD). */
	public static final OandaInstrument CFD_USB05Y_USD = new OandaInstrument("USB05Y_USD", US_TNOTE_5Y);
	/** US 10Y T-Note (CFD). */
	public static final OandaInstrument CFD_USB10Y_USD = new OandaInstrument("USB10Y_USD", US_TNOTE_10Y);
	/** US T-Bond (CFD). */
	public static final OandaInstrument CFD_USB30Y_USD = new OandaInstrument("USB30Y_USD", US_TBOND_30Y);

	/** Copper (CFD). */
	public static final OandaInstrument SPOT_XCU_USD = new OandaInstrument("XCU_USD", COPPER);
	/** Wheat (CFD). */
	public static final OandaInstrument SPOT_WHEAT_USD = new OandaInstrument("WHEAT_USD", WHEAT);
	/** Corn (CFD). */
	public static final OandaInstrument SPOT_CORN_USD = new OandaInstrument("CORN_USD", CORN);
	/** Soybeans (CFD). */
	public static final OandaInstrument SPOT_SOYBN_USD = new OandaInstrument("SOYBN_USD", SOYBEANS);
	/** Sugar (CFD). */
	public static final OandaInstrument SPOT_SUGAR_USD = new OandaInstrument("SUGAR_USD", SUGAR);

	/** West Texas Oil (CFD). */
	public static final OandaInstrument SPOT_WTICO_USD = new OandaInstrument("WTICO_USD", US_CRUDE_OIL);
	/** Brent Crude Oil (CFD). */
	public static final OandaInstrument SPOT_BCO_USD = new OandaInstrument("BCO_USD", BRENT_CRUDE_OIL);
	/** Natural Gas (CFD). */
	public static final OandaInstrument SPOT_NATGAS_USD = new OandaInstrument("NATGAS_USD", NATURAL_GAS);

	public OandaInstrument(String name, IInstrument underlying) {
		super(name, underlying);
	}

}
