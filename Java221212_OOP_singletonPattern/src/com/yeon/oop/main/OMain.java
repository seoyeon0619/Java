package com.yeon.oop.main;

import java.util.Calendar;

import com.yeon.oop.People.Me;

public class OMain {
	public static void main(String[] args) {
		Me m = Me.getMe();
		System.out.println(m);
		
		Me m2 = Me.getMe();
		System.out.println(m2);
		
		System.out.println("-----");
		
	}
}
