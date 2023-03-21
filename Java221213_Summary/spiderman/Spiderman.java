package com.kwon.dec132oop.spiderman;


// part 1 : PP
// part 2 : OOP
// part 3 : 유용한 내장 / 외부 클래스 소개

// GUI 프로그램 (윈도우 프로그램)
// 1. 윈도우 프로그램을 누가 자바로..
// 2. 윈도우 프로그램 -> 웹 베이스로..
// 3. 안드로이드 앱개발반이면 하겠는데
//		웹 개발 / BD / AI과는 1도 상관 없어서..

// 이것이 자바다 1,2 권 (책) -> 2권책은 통채로 필요 없음
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spiderman implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("거미줄 발사");
	}
}
