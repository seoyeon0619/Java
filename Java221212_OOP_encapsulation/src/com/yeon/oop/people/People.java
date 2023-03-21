package com.yeon.oop.people;

public class People {
	// public줘서 직접 수정하게 하면 위험 
	
	// 1. 멤버변수 private줘서 외부에서 못 건들게
	private String name;
	private int age;
	
	// 안전장치 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// 2. 멤버변수에 접근할 수 있는 통로를 생성
	public void setAge(int age) {
		// 3. 그 통로에 안전장치 만들기 
		if (age < 0 ) {
			age *= -1;
		} this.age = age;
	}

	public People() {
	}

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
