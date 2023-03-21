package com.yeon.uc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class UCMain2 {
	public static void main(String[] args) {

		HttpsURLConnection huc = null;
		try {
			String s = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113154000";
			URL u = new URL(s);

			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
	}
}
