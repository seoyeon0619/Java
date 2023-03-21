package com.yeon.oop.product;

import com.yeon.oop.test.Test;
// Test, IJKL의 관계 :다른패키지 상속 관계
public class IJKL extends Test{
	public void gogo() {
		Test t = new Test();
		t.a = 10;
		t.b = 20;
		t.c = 30;
		t.d = 40;
	}
}
