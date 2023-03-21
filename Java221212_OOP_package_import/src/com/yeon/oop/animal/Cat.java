package com.yeon.oop.animal;

public class Cat {
	String name;
	int age;
	
	public Cat() {
	}
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
