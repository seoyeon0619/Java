package com.yeon.eh.main;

import com.yeon.eh.calculator.Calculator;

public class EHMain3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		try {
			int d = Calculator.getMoks2(a, b);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("나누기에 0없음");
		}
	}
}
