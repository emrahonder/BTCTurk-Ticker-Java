package com.nioya.btcturkjava;

public class Tickers {
	
	private Ticker BTCTRY = new Ticker();
	private Ticker ETHBTC = new Ticker();
	private Ticker ETHTRY = new Ticker();
	private Ticker XRPTRY = new Ticker();
	
	public Ticker getBTCTRY() {
		return BTCTRY;
	}
	public void setBTCTRY(Ticker bTCTRY) {
		BTCTRY = bTCTRY;
	}
	public Ticker getETHBTC() {
		return ETHBTC;
	}
	public void setETHBTC(Ticker eTHBTC) {
		ETHBTC = eTHBTC;
	}
	public Ticker getETHTRY() {
		return ETHTRY;
	}
	public void setETHTRY(Ticker eTHTRY) {
		ETHTRY = eTHTRY;
	}
	public Ticker getXRPTRY() {
		return XRPTRY;
	}
	public void setXRPTRY(Ticker xRPTRY) {
		XRPTRY = xRPTRY;
	}
	
	
	
	

}
