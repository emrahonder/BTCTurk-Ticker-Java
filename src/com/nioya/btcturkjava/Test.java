package com.nioya.btcturkjava;

public class Test {

	public static void main(String[] args) {
		Btcturk btcturk = new Btcturk();
		Tickers tickers = btcturk.callForTicker();
		Ticker BTCTRY = tickers.getBTCTRY();
		System.out.println(BTCTRY.getLast());
	}

}
