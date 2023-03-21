package com.yeon.uc.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FWMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = k.next();
		Date now = new Date();
		System.out.print("생년월일(YYYYMMDD) : ");
		String birth = k.next();
		int age = 0;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date birth2 = sdf.parse(birth);
			
			// 현재 년도
			sdf = new SimpleDateFormat("yyyy");
			String curYear = sdf.format(now);
			int curYear2 = Integer.parseInt(curYear);
						
			// 출생 년도
			sdf = new SimpleDateFormat("yyyy");
			String myYear = sdf.format(birth2);
			int myYear2 = Integer.parseInt(myYear);
						
			// 한국 나이 
			age = curYear2 - myYear2 + 1;
			
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		System.out.print("국어 : ");
		int kor = k.nextInt();
		System.out.print("영어 : ");
		int eng = k.nextInt();
		System.out.print("수학 : ");
		int math = k.nextInt();
		
		double mean = (kor+eng+math)/3 ;
		System.out.printf("평균 : %.1f", mean);

		/*
		 * BufferedWriter bw = null; try { FileWriter fw = new
		 * FileWriter("C:\\seoyeon\\Program\\Student.txt", true); bw = new
		 * BufferedWriter(fw); bw.write(name + ","); bw.write(birth + ","); bw.write(kor
		 * + ","); bw.write(eng + ","); bw.write(math + ",\r\n");
		 * 
		 * bw.flush();
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * try { bw.close(); } catch (IOException e) { e.printStackTrace(); }
		 */

		// ------------------------------------------------------
		// OutputStreaWriter개조형 : 2bytes(글자라는걸 인식하는 상태)
		// OutputStream 개조형 : 1byte (글자를 인식하지 못하는 상태)
		// 전 세계적 인코딩 방식 : utf-8
		// euc-kr 쓰는 고이 없지 않음

		BufferedWriter bw = null;
		try {
			FileOutputStream fos = new FileOutputStream("C:\\seoyeon\\Program\\Student.csv", true);
			// 정품 쓰는 느낌으로다가 인코딩 방식을 지정할 수 있음
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);

			String data = String.format("%s, %s, %d, %d, %d, %d, %.1f\r\n", name, birth, age, kor, eng, math, mean);
			bw.write(data);
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
