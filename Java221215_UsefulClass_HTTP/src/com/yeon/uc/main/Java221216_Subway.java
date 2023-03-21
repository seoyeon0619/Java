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
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//USE_DT, LINE_NUM, SUB_STA_NM, RIDE_PASGR_NUM, ALIGHT_PASGR_NUM
public class Java221216_Subway {
	public static void main(String[] args) {

		HttpURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			FileOutputStream fos = new FileOutputStream("C:\\seoyeon\\Program\\subway3.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			
			for (int y = 2015; y < 2022; y++) {
				for (int m = 1; m < 13; m++) {
					for (int d = 1; d < 32; d++) {
						String when = String.format("%d%02d%02d", y, m, d);
						String addr = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/CardSubwayStatsNew/1/700/" + when;
						URL u = new URL(addr);
						huc = (HttpURLConnection) u.openConnection();
						
						InputStream is = huc.getInputStream();
						InputStreamReader isr = new InputStreamReader(is, "utf-8");
						BufferedReader br = new BufferedReader(isr);
						
						
						
						JSONParser jp = new JSONParser();
						
						JSONObject subwayData = (JSONObject) jp.parse(br.readLine());
						JSONObject cssn = (JSONObject) subwayData.get("CardSubwayStatsNew");
						
						if (cssn != null) {
							JSONArray r = (JSONArray) cssn.get("row");
							
							JSONObject station = null;
							for (int i = 0; i < r.size(); i++) {
								station = (JSONObject) r.get(i);
								
								bw.write(when.substring(0, 4) + ",");
								bw.write(when.substring(4, 6) + ",");
								bw.write(when.substring(6, 8) + ",");
								bw.write(station.get("LINE_NUM") + ",");
								bw.write(station.get("SUB_STA_NM") + ",");
								bw.write(station.get("RIDE_PASGR_NUM") + ",");
								bw.write(station.get("ALIGHT_PASGR_NUM") + ",\r\n");
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
