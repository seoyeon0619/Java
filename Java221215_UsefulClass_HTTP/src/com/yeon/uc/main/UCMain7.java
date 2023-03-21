package com.yeon.uc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UCMain7 {
	public static void main(String[] args) {

		HttpsURLConnection huc = null;
		try {
			String s = "https://api.openweathermap.org/data/2.5/weather?q=seongnam&appid=baff8f3c6cbc28a4024e336599de28c4&units=metric&lang=kr";
			URL u = new URL(s);

			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(br.readLine());

			JSONArray ja = (JSONArray) jo.get("weather");
			JSONObject w = (JSONObject) ja.get(0);
			System.out.println(w.get("description"));

			JSONObject t = (JSONObject) jo.get("main");
			System.out.println(t.get("temp"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
	}
}
