package com.nioya.btcturkjava;

public class Test {

	public static void main(String[] args) {
		Btcturk btcturk = new Btcturk();
		Tickers tickers = btcturk.callForTicker();
		
		Object[] tickerList = tickers.getTickerList();
		for (Object string : tickerList) {
			System.out.println(string);
		}
		
		Ticker BTCTRY = tickers.getTicker("XRPTRY");
		System.out.println(BTCTRY.getLast());
		
		/* Available tickers:
		 * ETHTRY
		 * USDTTRY
		 * BTCTRY
		 * BTCUSDT
		 * XRPTRY
		 * LTCTRY
		 * */
		

		
	}

}
