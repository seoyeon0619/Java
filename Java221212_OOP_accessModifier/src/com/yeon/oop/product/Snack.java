package com.yeon.oop.product;

public class Snack {
	String name;
	int price;
	
	public Snack() {
	}

	public Snack(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
}
