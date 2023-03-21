package com.yeon.uc.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FRMain2_t {
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
					
					System.out.printf("생년월일 : %s\n", data[1]);
					
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
					String cy = sdf.format(new Date());
					int cy2 = Integer.parseInt(cy);
					
					String by = data[1].substring(0,4);
					int by2 = Integer.parseInt(by);
					
					System.out.println(cy2 - by2 +1);
					
					System.out.printf("국어 : %s점\n", data[3]);
					System.out.printf("수학 : %s점\n", data[4]);
					System.out.printf("영어 : %s점\n", data[5]);

					int sum = Integer.parseInt(data[3]) +
							Integer.parseInt(data[4]) +
							Integer.parseInt(data[5]);
					System.out.println(sum / 3.0);
							
					System.out.println("-----");
					}
				}
					
			 catch (Exception e) {
			}
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
		
		
	

