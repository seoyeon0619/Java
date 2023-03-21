package com.yeon.uc.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class UCMain6 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 1; i < 11; i++) {
			String fileName = String.format("[이문열]삼국지 %02d.txt", i);
			BufferedReader br = null;
			try {
				FileInputStream fis = new FileInputStream("C:\\seoyeon\\Program\\이문열 삼국지\\" + fileName);
				InputStreamReader isr = new InputStreamReader(fis, "euc-kr");
				br = new BufferedReader(isr);

				String line = null;
				while ((line = br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line, " ");
					while (st.hasMoreTokens()) {

						String word = st.nextToken();
						String name = null;

						if (word.contains("유비")) {
							name = "유비";
						} else if (word.contains("조조")) {
							name = "조조";
						} else if (word.contains("손권")) {
							name = "순권";
						}
						if (name != null) {
							if (hm.containsKey(name)) {
								int c = hm.get(name);
								c += 1;
								hm.put(name, c);
							} else {
								hm.put(name, 1);
							}
						}

					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Set<String> s = hm.keySet();
		ArrayList<String> al = new ArrayList<>(s);
		for (String string : al) {
			System.out.println(string);
			System.out.println(hm.get(string));
		}
	}
}
