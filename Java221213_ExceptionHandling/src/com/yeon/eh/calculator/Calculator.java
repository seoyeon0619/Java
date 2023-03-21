package com.yeon.eh.calculator;

//예외처리
//	1.
//try {
// 여기 하다가
//} catch (Exception e) {
// 예외가 터지면 잡힘
//int c = a / b;
//} finally {
//언제든지 무조건 
//}
public class Calculator {

	public static int getMoks(int a, int b) {
		try {
			int c = a / b;
			return c;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("나누기에 0없음");
			return -1;
		} finally {
			System.out.println("finally");
		}
	}
	
	
	public static int getMoks2(int a, int b) throws ArithmeticException {
		int d = a / b;
		return d;
	}
}
