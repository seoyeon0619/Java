package com.yeon.uc.main;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class UCMain6 {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		HttpURLConnection huc = null;
		try {
			// 서울열린데이터광장
			String s = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/RealtimeCityAir/1/25/";
			URL u = new URL(s);

			huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			// 내 컴퓨터 파일
			FileOutputStream fos = new FileOutputStream("C:\\seoyeon\\Program\\dust.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			int what = xpp.getEventType(); // 시작태그
			String tagName = null;

			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy, MM, dd, k");
			String now2 = sdf.format(now);

			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {

					if (tagName.equals("MSRRGN_NM")) {
						bw.write(now2 + ", ");
						bw.write(xpp.getText() + ", ");

					} else if (tagName.equals("MSRSTE_NM")) {
						bw.write(xpp.getText() + ", ");

					} else if (tagName.equals("PM10")) {
						bw.write(xpp.getText() + ", ");

					} else if (tagName.equals("PM25")) {
						bw.write(xpp.getText() + ", ");

					} else if (tagName.equals("IDEX_NM")) {
						bw.write(xpp.getText() + ", \r\n");
						bw.flush();
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
