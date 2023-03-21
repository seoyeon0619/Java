package com.yeon.oop.main;

import com.yeon.oop.hero.Hero;
import com.yeon.oop.hero.Hulk;
import com.yeon.oop.hero.Ironman;
import com.yeon.oop.hero.Spiderman;

public class OMain {
	public static void main(String[] args) {
		Ironman i = new Ironman("토니", 40, "자비스");
		i.printInfo();
		i.attack();
		System.out.println("-----");
		Hulk h = new Hulk("배너", 30, 40);
		h.printInfo();
		h.attack();
		
		System.out.println("-----");
		
		// 클래스명이 밝혀지지않은 Hero의 하위클래스 부분
		// anonymous inner class
		Hero he = new Hero() { 
			@Override
			public void attack() {
				System.out.println("방패 던지기!");
			}
		};
		
		Hero hero = new Ironman();
		hero.attack();
		
		// Ironman[] iron; // iron배열에 Ironman만 들어감
		Hero[] iron; // iron배열에 Hero모두 들어감
	}
}
