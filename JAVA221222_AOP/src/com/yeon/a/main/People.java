package com.yeon.a.main;

public class People {
	String name;
	int age;
	public People() {
		// TODO Auto-generated constructor stub
	}
	public People(String name, int age) {
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
	
	// 밖에서 따로 부르지 않는 기능
	private void ready() {
		System.out.println("씻고");
		System.out.println("단장하고");
		System.out.println("밖으로 나와서");
		System.out.println("엘리베이터 타고");
	}
	
	public void goSchool() {
		ready();
		System.out.println("지하철 타고");
		System.out.println("도착");
	}
	
	public void goMart() {
		ready();
		System.out.println("걸어서");
		System.out.println("도착");
	}
	
	
}
