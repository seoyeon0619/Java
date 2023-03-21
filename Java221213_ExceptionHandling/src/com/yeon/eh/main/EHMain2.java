package com.yeon.eh.main;

public class EHMain2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] c = { 12, 123 };
		
		try {
			System.out.println(c[b]);
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("모든 예외 상황");
		} finally {
			System.out.println("무조건 실행");
			
		}
	}
}
