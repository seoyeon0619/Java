package com.yeon.eh.main;

import java.util.Scanner;

public class EHMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int a = k.nextInt();
		System.out.print("숫자 2 : ");
		int b = k.nextInt();

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e2) {
			System.out.println("나누기는 0이 없어");
		}
		
	}
}
