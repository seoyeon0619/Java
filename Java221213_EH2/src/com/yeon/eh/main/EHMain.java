package com.yeon.eh.main;

import com.yeon.eh.calculator.Calculator;

public class EHMain {
	public static void main(String[] args) {
		int q = 10;
		int w = 0;
		try {
			int d = Calculator.getMoks2(q, w);
			System.out.println(d);
		} catch (Exception e) {
			System.out.println("곤란합니다");
		}
		
	}
}
