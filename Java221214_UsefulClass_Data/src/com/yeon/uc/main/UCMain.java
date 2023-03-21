package com.yeon.uc.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UCMain {
	public static void main(String[] args) {


		/*
		 * System.out.println(now.getYear()); System.out.println(now.getMonth());
		 * System.out.println(now.getDay());
		 */

		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		
		String now2 = sdf.format(now);
		System.out.println(now2);*/
		
		 /*특정시간날짜
		try {
			String newYear = "2000/06/19" ;
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
			Date newYear2 = sdf2.parse(newYear);
			System.out.println(newYear2);
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		
		
		 //현재시간날짜
		Date now = new Date();
		System.out.println(now);
		System.out.println("-----");
		
		try {
			String birthday = "20000619";
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			Date birthday2 = sdf.parse(birthday);
			
			// 출생 요일 
			sdf = new SimpleDateFormat("E");
			String yoil = sdf.format(birthday2);
			System.out.println(yoil);
			
			// 현재 년도
			sdf = new SimpleDateFormat("yyyy");
			String curYear = sdf.format(now);
			int curYear2 = Integer.parseInt(curYear);
			
			// 출생 년도
			sdf = new SimpleDateFormat("yyyy");
			String myYear = sdf.format(birthday2);
			int myYear2 = Integer.parseInt(myYear);
			
			// 한국 나이 
			int age = curYear2 - myYear2 + 1;
			System.out.println(age);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
