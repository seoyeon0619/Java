package com.kwon.dec131oop.main;

import com.kwon.dec131oop.car.Car;

public class Taxi extends Car {
	private int n;
	
	public Taxi() {
		// TODO Auto-generated constructor stub
	}

	public Taxi(String company, int price, int n) {
		super(company, price);
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(n);
	}
	
}
