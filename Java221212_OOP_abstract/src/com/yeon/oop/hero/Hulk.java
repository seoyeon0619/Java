package com.yeon.oop.hero;

public class Hulk extends Hero{
	private int size;
	
	public Hulk() {
		// TODO Auto-generated constructor stub
	}

	public Hulk(String name, int age, int size) {
		super(name, age);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(size);
	}
	
	@Override
	public void attack() {
		System.out.println(getName());
		System.out.println("주먹질!");
	}
}
