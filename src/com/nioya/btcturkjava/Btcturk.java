package com.nioya.btcturkjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

public class Btcturk {

	private String btcturkUri = "https://www.btcturk.com/api/";

	public Btcturk() {

	}

	public Tickers callForTicker() {
		String targetUrl = this.btcturkUri + "ticker";
		HttpGet httpGet = new HttpGet(targetUrl);
		String output = executer(httpGet);
		
		JSONArray jsonArray = new JSONArray(output);
		Tickers tickers = new Tickers();
		if (output != "") {
			Gson gson = new Gson();

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject tempJSON = jsonArray.getJSONObject(i);
				Ticker ticker = gson.fromJson(tempJSON.toString(), Ticker.class);
				tickers.setTicker(ticker.getPair(),ticker);

			}
		}

		return tickers;

	}

	private String executer(HttpUriRequest httpUriRequest) {

		String output = null;
		HttpResponse response = null;

		CloseableHttpClient closeableHttpClient = null;
		try {

			closeableHttpClient = HttpClientBuilder.create().build();
			response = closeableHttpClient.execute(httpUriRequest);
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (response != null) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
			} catch (UnsupportedOperationException e) {
				e.printStackTrace();
				// TODO Logger
			} catch (IOException e) {
				e.printStackTrace();
				// TODO Logger
			}
			if (br != null) {
				try {
					output = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
					// TODO Logger
				}
			}

		}

		try {
			closeableHttpClient.close();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO Logger
		}
		return output;
	}

}
