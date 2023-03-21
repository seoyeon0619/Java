package com.yeon.uc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// 통신
@SuppressWarnings("deprecation")
public class UCMain {
	public static void main(String[] args) {

		try {
			DefaultHttpClient dhc = new DefaultHttpClient();

			// GET방식 요청
			HttpGet hg = new HttpGet("https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113154000");

			HttpResponse hr = dhc.execute(hg);

			// 응답내용
			HttpEntity he = hr.getEntity();

			InputStream is = he.getContent();

			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
