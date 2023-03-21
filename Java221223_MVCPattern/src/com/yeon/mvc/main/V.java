package com.yeon.mvc.main;

import java.util.Scanner;
// 입력받고 출력하는 영역
public class V {
	public static int getX() {
		Scanner k = new Scanner(System.in);
		System.out.print("x : "); 
		int x = k.nextInt();
		return x;
	}
	
	public static void print(String r) {
		System.out.println(r);
	}
}
