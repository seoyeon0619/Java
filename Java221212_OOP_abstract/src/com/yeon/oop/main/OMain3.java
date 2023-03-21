package com.yeon.oop.main;

import com.yeon.oop.hero.Ironman;

public class OMain3 {
	public static void main(String[] args) {
		Ironman i = new Ironman("토니", 40, "자비스");
		i.attack();
		i.eat();
		i.fly();
	}
}
