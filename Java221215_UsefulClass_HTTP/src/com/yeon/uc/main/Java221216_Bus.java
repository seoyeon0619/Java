package com.yeon.uc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Java221216_Bus {
	public static void main(String[] args) {
		HttpURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			FileOutputStream fos = new FileOutputStream("C:\\seoyeon\\Program\\Bus.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);

			for (int y = 2020; y < 2022; y++) {
				for (int m = 1; m < 13; m++) {
					for (int d = 1; d < 32; d++) {
						String when = String.format("%d%02d%02d", y, m, d);
						String addr = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/CardBusStatisticsServiceNew/1/5/1000"
								+ when;
						URL u = new URL(addr);
						huc = (HttpURLConnection) u.openConnection();

						InputStream is = huc.getInputStream();
						InputStreamReader isr = new InputStreamReader(is, "utf-8");
						BufferedReader br = new BufferedReader(isr);

						JSONParser jp = new JSONParser();

						JSONObject BusData = (JSONObject) jp.parse(br.readLine());
						JSONObject cbssn = (JSONObject) BusData.get("CardBusStatisticsServiceNew");

						if (cbssn != null) {
							JSONArray r = (JSONArray) cbssn.get("row");

							JSONObject station = null;
							for (int i = 0; i < r.size(); i++) {
								station = (JSONObject) r.get(i);

								bw.write(when.substring(0, 4) + ", ");
								bw.write(when.substring(4, 6) + ", ");
								bw.write(when.substring(6, 8) + ", ");
								bw.write(station.get("BUS_ROUTE_NM") + ", ");
								bw.write(station.get("BUS_STA_NM") + ", ");
								bw.write(station.get("RIDE_PASGR_NUM") + ", ");
								bw.write(station.get("ALIGHT_PASGR_NUM") + ", \r\n");
								bw.flush();
							}

						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
