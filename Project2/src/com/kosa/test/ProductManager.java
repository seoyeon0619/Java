package com.kosa.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
	ArrayList<ProductDto> list = new ArrayList<ProductDto>();
	Scanner sc = new Scanner(System.in);
	
	public ProductManager() {
		list.add(new ProductDto(1, "노트북", 1200000, "2020-09-09", "삼성전자"));
		list.add(new ProductDto(2, "갤럭시S", 7500000, "2022-07-08", "삼성전자"));
		list.add(new ProductDto(3, "노트북", 1200000, "2020-02-07", "엘지전자"));
	}
	
	void insert() {
		ProductDto dto = new ProductDto();
		
		// 맨 마지막에 있는 데이터보다 하나 크게 자동증가
		int num = list.get(list.size()-1).getPrdNum()+1;
		dto.setPrdNum(num);
		
		System.out.print("제품명 : ");
		dto.setPrdName(sc.next());
		System.out.print("가격 : ");
		dto.setPrdPrice(sc.nextInt());
		System.out.print("제조일 : ");
		dto.setPrdDate(sc.next());
		System.out.print("제조사 : ");
		dto.setPrdMaker(sc.next());
		list.add(dto);
	}
	
	void output() {
		for (ProductDto dto : list) {
			System.out.println(dto);
		}
	}
	
	void menuDisplay() {
		System.out.println("메뉴");
		System.out.println("1. 출력");
		System.out.println("2. 추가");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
	}
	
	public void start() {
		
		int menu;
		while (true) {
			menuDisplay();
			System.out.print("선택 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:output(); break;
			case 2:insert(); break;
			case 3:modify(); break;
			case 4:delete(); break;
			case 0: return;
			}
		}
	}
	
	void modify() {
		System.out.print("수정할 제품 번호 : ");
		int num = sc.nextInt();
		// indexOf : 내부적으로 equals 호출해서 데이터 위치를 찾음
		// 자바에서 오류가 발생하면 -1을 리턴하는 식으로 함수를 구성
		int pos = list.indexOf(new ProductDto(num));
		
		// 에러처리는 윗쪽에서, else사용하지 말고 return 시킬 것
		if(pos==-1) // 데이터가 없을 경우
		{
			System.out.println("제품을 찾을 수 없습니다");
			return;
		}
		
		ProductDto dto = list.get(pos);
		System.out.print("제품명 : ");
		dto.setPrdName(sc.next());
		System.out.print("가격 : ");
		dto.setPrdPrice(sc.nextInt());
		System.out.print("제조일 : ");
		dto.setPrdDate(sc.next());
		System.out.print("제조사 : ");
		dto.setPrdMaker(sc.next());
	}
	
	void delete() {
		System.out.print("삭제할 제품 번호 : ");
		int num = sc.nextInt();
		int pos = list.indexOf(new ProductDto(num));
		
		if(pos==-1) 
		{
			System.out.println("제품을 찾을 수 없습니다");
			return;
		}
		
		list.remove(new ProductDto(num, "", 0, "", ""));
		// equals 호출 
	}
	
	
}
