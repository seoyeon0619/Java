package com.yeon.oop.hero;

import com.yeon.oop.people.Flyer;
import com.yeon.oop.people.People;

public class Ironman extends Hero implements People, Flyer {
	private String aiName;

	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, String aiName) {
		super(name, age);
		this.aiName = aiName;
	}

	public String getAiName() {
		return aiName;
	}

	public void setAiName(String aiName) {
		this.aiName = aiName;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(aiName);
	}

	@Override
	public void attack() {
		// System.out.println(name);
		// 상속과 상관없이 Hero에 있는 name이라 안됨
		System.out.println(getName());
		System.out.println("빔 발사!");
	}

	@Override
	public void eat() {
		System.out.println("냠");

	}

	@Override
	public void fly() {
		System.out.println("휭");
	}

}
