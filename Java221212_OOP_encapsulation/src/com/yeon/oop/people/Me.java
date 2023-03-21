package com.yeon.oop.people;

public class Me extends People {
	private String name;
	private int age;
	private boolean now;

	public Me() {
		// TODO Auto-generated constructor stub
	}

	public Me(String name, int age, boolean now) {
		super();
		this.name = name;
		this.age = age;
		this.now = now;
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

	public boolean isNow() {
		return now;
	}

	public void setNow(boolean now) {
		this.now = now;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(now);
	}
}
