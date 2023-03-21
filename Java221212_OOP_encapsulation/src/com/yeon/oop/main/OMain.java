package com.yeon.oop.main;

import java.util.Scanner;

public class OMain {
	public static void main(String[] args) {
		com.yeon.oop.people.People p = new com.yeon.oop.people.People("홍길동", 30);
		p.printInfo();
		System.out.println("-----");
		
		Scanner k = new Scanner(System.in);
		System.out.print("수정할 나이 : ");
		int a = k.nextInt();
		//p.age = a;
		p.setAge(a);
		System.out.println("-----");
		p.printInfo();
		System.out.println("-----");
		
		com.yeon.oop.product.Coffee c = new com.yeon.oop.product.Coffee("아아", 3000);
		c.printInfo();
		System.out.println("-----");
		
		com.yeon.oop.people.Me m = new com.yeon.oop.people.Me("이서연", 23, true);
		m.printInfo();
		System.out.println("-----");
	}
}
