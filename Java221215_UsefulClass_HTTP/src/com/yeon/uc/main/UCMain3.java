package com.yeon.uc.main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class UCMain3 {
	public static void main(String[] args) {

		HttpsURLConnection huc = null;
		try {
			String s = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113154000";
			URL u = new URL(s);

			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			int what = xpp.getEventType(); // 시작태그
			String tagName = null;

			// hour, temp, wfKor
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("hour")) {
						System.out.println("~" + xpp.getText() + "시 까지");

					} else if (tagName.equals("temp")) {
						System.out.println(xpp.getText() + "℃");

					} else if (tagName.equals("wfKor")) {
						System.out.println(xpp.getText() + "\n");
					}
				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
				}

				xpp.next(); // 다음
				what = xpp.getEventType(); // 그건 뭐냐
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();

	}
}
