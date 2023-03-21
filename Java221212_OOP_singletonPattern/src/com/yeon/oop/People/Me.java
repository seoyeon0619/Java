package com.yeon.oop.People;

// static 멤버변수 : 여러객체의 공통속성
public class Me {
	private String name;
	private int age;
	
	// 1. 객체를 외부에서 못 만들게
	// 2. 내부에서 객체 하나 만들어서 고정시키기
	private static final Me ME = new Me("이서연", 23);
	
	private Me() {
		// TODO Auto-generated constructor stub
	}
	
	private Me(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 3. 2번에서 만들어놓은 객체 외부에서 쓸 수 있게
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

	public static Me getMe() {
		return ME;
	}
	
	
	
	
}
