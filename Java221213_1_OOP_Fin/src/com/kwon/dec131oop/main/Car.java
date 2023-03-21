package com.kwon.dec131oop.main;
// final 멤버변수 : 상수화
// final 메소드 : 오버라이딩 불가
// final 클래스 : 상속을 못 받음 (상속 불가)
public /*final*/ class Car {
	private String company;
	private int price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
		
	
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//final
	public /*final*/ void printInfo() {
		System.out.println(company);
		System.out.println(price);
	}
}
