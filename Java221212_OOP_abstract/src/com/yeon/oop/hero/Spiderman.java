package com.yeon.oop.hero;
// 추상 메소드는 내용 없는 메소드로 하위클래스에서 반드시 오버라이딩해야함
public class Spiderman extends Hero	{

	@Override
	public void attack() {
		System.out.println("거미줄 발사!");
	}
	
}
