package com.kwon.dec132oop.main;

import com.kwon.dec132oop.human.Human;
import com.kwon.dec132oop.ironman.Ironman;
import com.kwon.dec132oop.star.Planet;

public class OMain {
	// 이름이 지구인 별
	// 그 별 사이즈 500
	// 보이게

	public static void main(String[] args) {

		Planet s = new Planet("지구");
//		Planet s1 = new Planet("지구", 500, true);
//		s1.print();
//		System.out.println("--------------");
//		Planet s2 = new Planet("화성", 300, false);
//		s2.print();
//		System.out.println("--------------");

		// 이 사람을 지구에 살고 있는 사람으로 등록
		Human h = new Human("홍길동");
		h.print();
		s.add(h);
		System.out.println("--------------");

		//사수의 영역--------------------------------------
		// 영웅 : 공격하기 기능이 반드시 있어야하는 영웅
		// 공격하기를 추상 메소드로 하자
		// 추상 클래스 또는 인터페이스
		// 상속라인은 막기는 싫으니 -> 인터페이스
		//-------------------------------------------------
		Ironman i = new Ironman();
		i.attack();
		System.out.println("--------------");
		
		// 홍길동이 아이언맨을 전담 영웅으로 
		h.pick(i);
		
		// 홍길동이 위험에 빠져서 아이언맨한테 도와달라
		h.helpMe();
		System.out.println("--------------");
		s.setSize(500);
		s.setVisiable(true);
		s.print();
	}
}
