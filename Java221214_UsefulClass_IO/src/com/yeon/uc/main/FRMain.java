package com.yeon.uc.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FRMain {
	public static void main(String[] args) {
		// 파일 처리하기 편하라고 InputStreamReader개조형
		// 내용이 없으면 null
		
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\seoyeon\\Program\\1214.txt");
			BufferedReader br = new BufferedReader(fr);

			String line;

			// 한 줄 읽어서 line에 저장하고 null이 아닐 때까지만 반복
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
