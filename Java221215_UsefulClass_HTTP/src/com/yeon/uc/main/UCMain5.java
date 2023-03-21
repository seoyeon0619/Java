package com.yeon.uc.main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class UCMain5 {
	public static void main(String[] args) {

		HttpURLConnection huc = null;
		try {
			String s = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/RealtimeCityAir/1/25/";
			URL u = new URL(s);

			huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			int what = xpp.getEventType(); // 시작태그
			String tagName = null;

			// MSRRGN_NM, MSRSTE_NM, PM10, PM25, IDEX_NM
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {

					if (tagName.equals("MSRRGN_NM")) {
						System.out.println("권역명 : " + xpp.getText());

					} else if (tagName.equals("MSRSTE_NM")) {
						System.out.println("측정소명 : " + xpp.getText());

					} else if (tagName.equals("PM10")) {
						System.out.println("미세먼지(㎍/㎥) : " + xpp.getText());

					} else if (tagName.equals("PM25")) {
						System.out.println("초미세먼지농도(㎍/㎥) : " + xpp.getText());

					} else if (tagName.equals("IDEX_NM")) {
						System.out.println("오존(ppm) : " + xpp.getText() + "\n");
					}
				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
				}

				xpp.next();
				what = xpp.getEventType();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();

	}
}
