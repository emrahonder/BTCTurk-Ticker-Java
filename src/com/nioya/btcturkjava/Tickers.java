package com.nioya.btcturkjava;

import java.util.HashMap;

public class Tickers {
	
	private HashMap<String, Ticker> tickers = new HashMap<String, Ticker>();

	public HashMap<String, Ticker> getTickers() {
		return tickers;
	}
	public Ticker getTicker(String currency) {
		return this.tickers.get(currency);
	}

	public void setTicker(String currency, Ticker ticker) {
		this.tickers.put(currency, ticker);
	}
	
	public void setTickers(HashMap<String, Ticker> tickers) {
		this.tickers = tickers;
	}
	
	
	public Object[] getTickerList() {
		Object[] keyset = tickers.keySet().toArray();
		return keyset;
	}
	
	
	
	
	

}
