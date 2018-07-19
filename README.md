# BTCTurk Ticker Java
Lib show BTCTurk exchange prices dynamically by using Java. With using gson lib, json response is converted into a java class which can be used easily

```
		Btcturk btcturk = new Btcturk();
		Tickers tickers = btcturk.callForTicker();
		Ticker BTCTRY = tickers.getTicker("XRPTRY");
		System.out.println(BTCTRY.getLast());
```
BTCTURK is the one of leader BTC, ETH and XRP exhange market. For api details, please visit this URL: https://github.com/BTCTrader/broker-api-docs
