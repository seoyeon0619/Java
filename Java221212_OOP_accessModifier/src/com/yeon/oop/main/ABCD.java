package com.yeon.oop.main;

import com.yeon.oop.test.Test;

// Test, ABCD간의 관계 1도 없음 다른패키지
public class ABCD {
	public void gogo() {
		Test t = new Test();
		t.a = 10;
		t.b = 20;
		t.c = 30;
		t.d = 40;
	}
}
