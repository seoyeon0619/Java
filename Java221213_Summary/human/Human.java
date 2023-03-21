package com.kwon.dec132oop.human;

import com.kwon.dec132oop.hero.Hero;
// Avengers a = new Ironman();
// Avengers a = new Spiderman();

public class Human {
	private String name;
	private Hero hero; // 다형성

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pick(Hero h) {
		hero = h;
		//System.out.printf("전담영웅 : %s", hero);
	}
	
	public void helpMe() {
		hero.attack();
	}

	public void print() {
		System.out.println(name);
	}
}
