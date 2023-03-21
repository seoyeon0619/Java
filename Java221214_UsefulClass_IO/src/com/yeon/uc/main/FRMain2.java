package com.yeon.uc.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FRMain2 {
	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\seoyeon\\Program\\Student.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			
			String line ;
			String[] data = null;
			
			while ((line = br.readLine()) != null) {
				data = line.split(",");
				
				System.out.printf("이름 : %s\n", data[0]);
				System.out.printf("생년월일 : %s[%s세]\n", data[1], data[2]);
				System.out.printf("국어 : %s점\n", data[3]);
				System.out.printf("수학 : %s점\n", data[4]);
				System.out.printf("영어 : %s점\n", data[5]);
				System.out.printf("평균 : %s점\n", data[6]);
				System.out.println("-----");
			}
				
		} catch (Exception e) {
		}
		
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
