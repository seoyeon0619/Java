package com.yeon.oop.hero;

public abstract class Hero {
	private String name;
	private int age;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	// Hero : attack이란 추상 메소드를 갖고 있음	
	public abstract void attack();
}
