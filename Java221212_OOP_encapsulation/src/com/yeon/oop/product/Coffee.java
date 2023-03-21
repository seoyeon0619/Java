package com.yeon.oop.product;

public class Coffee {
	// 1. 멤버변수
	private String name;
	private int price;

	// 2. 생성자들
	public Coffee() {
	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// 3. 캠슐화 통로 (필요한것만)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 4. 기타 메소드
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}

	
}
