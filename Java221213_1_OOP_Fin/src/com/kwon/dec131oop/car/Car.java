package com.kwon.dec131oop.car;

public class Car {
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

	public void printInfo() {
		System.out.println(company);
		System.out.println(price);
	}
}
