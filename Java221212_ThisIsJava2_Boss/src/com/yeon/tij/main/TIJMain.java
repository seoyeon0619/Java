package com.yeon.tij.main;
// 회사측 결정사향

// 		프로젝트 시작 : 어벤져스 게임을 만들어야 함
// 		사수 : 공격하기 기능이 있는 아이언맨 만들어라  
// 		나 : 제출(.jar + 문서)
//		사수 : 10넣으면 10번 쏴야지, 메소드명이 attack이 뭐냐


//회사측 결정사향
//	프로젝트 시작 : 어벤져스 게임을 만들어야 함
//	사수 : 공격하기 기능이 있는 헐크 만들어라  
//			+ 반드시 작업하도록 추상 메소드 (인터페이스)
public class TIJMain {
	public static void main(String[] args) {
		Hulk h = new Hulk();
		h.throwPunch();
	}
}
