package com.yeon.oop.main;

import com.yeon.oop.product.Snack;

public class OMain {
	public static void main(String[] args) {
		com.yeon.oop.product.Snack s = new com.yeon.oop.product.Snack("새우깡", 1500);
		s.printInfo();
		System.out.println("-----");
		
		// 가격이 올랐음
		//s.price = 3000; 
	}
}
