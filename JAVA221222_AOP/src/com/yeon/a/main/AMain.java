package com.yeon.a.main;

public class AMain {
	public static void main(String[] args) {
		People p = new People("홍길동", 30);
		p.printInfo();
		System.out.println("-----");
		p.goSchool();
		System.out.println("-----");
		p.goMart();
		
	}
}
