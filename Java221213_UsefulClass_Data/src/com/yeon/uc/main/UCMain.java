package com.yeon.uc.main;

import java.util.StringTokenizer;

public class UCMain {
	public static void main(String[] args) {
		String s = new String("abc");
		
		// 기본형처럼 쓸 수 있게 만든 새 문법
		// String s = "abc";
		
		// s가 객체인데 a로 시작하는지
		System.out.println(s.startsWith("a"));
		// s에 두번째 글자가 무엇인가 
		System.out.println(s.charAt(1));
		// s에서 b를 비로 바꿔서 출력
		System.out.println(s.replace("b", "비"));
		// s가 총 몇 글자인가 
		System.out.println(s.length());
		
		String s2 = String.format("%.1f", 1.1234);
		System.out.println(s2);
		
		// 글자 붙일 때 + 쓰지마라 
		String s3 = "ㅋㅋㅋ";
		s3 += "ㅎㅎㅎ";
		// s3 = s3 + "ㅎㅎㅎ";
		// s3 = new String(s3 + "ㅎㅎㅎ");
		// 새로운 객체에 복사해서 뒤에 붙이고 garbage collection 실행 
		// 컴퓨터의 입장에서 부담스러움 
		s3 = s3.concat("ㅇㅇ");
		System.out.println(s3);
		
		StringBuffer sb = new StringBuffer("ㅋㅋㅋ");
		sb.append("ㅎㅎㅎ");
		sb.append("ㅇㅇ");
		String s4 = sb.toString();
		System.out.println(s4);
		
		// 문자열 분리
		String s5 = "홍길동,김길동,최길동";
		// 분리해서 배열로 → 정형데이터에 유리함 
		String[] sAr = s5.split(",");
		System.out.println(sAr[1]);
		
		StringTokenizer st = new StringTokenizer(s5, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
