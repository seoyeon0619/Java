package com.kwon.dec131oop.main;

//import com.kwon.dec131oop.car.Car;
import com.kwon.dec131oop.taxi.Taxi;

// A로부터 상속받는 B
public class OMain {
	//B 객체 생성
	public static void main(String[] args) {
  		Taxi t = new Taxi("현대자동차", 4000, 4);
		t.printInfo();
		System.out.println("----------");
		t.setCompany("삼성");
		System.out.println(t.getCompany());
		System.out.println("----------");
		t.printInfo();
	}
}
