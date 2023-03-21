package com.yeon.mvc.main;

public class Calculator {
	// 메소드 결과가 여러개 나와야 할 때 : [], List, Set, Map
	// ㄴ> 객체
	public static CalcResult Calculate(int x, int y) {
		// 계산하면 계산결과 객체가 나오는 형태
		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;
		return new CalcResult(a, b, c, d);
	}
}
