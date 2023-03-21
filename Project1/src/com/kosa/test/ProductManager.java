package com.kosa.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
	int prdNum=0;
	int n =0;
	Scanner k = new Scanner(System.in);
	ArrayList<ProductDto> list = new ArrayList<ProductDto>();
	
	
	public ProductManager() {
		list.add(new ProductDto(1, "노트북", 1200000, "2020-09-09", "삼성전자"));
		list.add(new ProductDto(2, "갤럭시S", 7500000, "2022-07-08", "삼성전자"));
		list.add(new ProductDto(3, "노트북", 1200000, "2020-02-07", "엘지전자"));
	}
	
	public void start() {
		while (true) {
			System.out.println("메뉴");
			System.out.println("1. 출력");
			System.out.println("2. 추가");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("번호를 입력하세요 : ");
			n = k.nextInt();
			if (n == 1)
				select();
			else if (n == 2)
				insert();
			else if (n == 3)
				update();
			else if (n == 4)
				delete();
			else
				break;
			
		}
	}
	
	public void insert() {
		ProductDto dto = new ProductDto();
		System.out.print("번호 : ");
		dto.setPrdNum(k.nextInt());
		System.out.print("제품명 : ");
		dto.setPrdName(k.next());
		System.out.print("가격 : ");
		dto.setPrdPrice(k.nextInt());
		System.out.print("제조일 : ");
		dto.setPrdDate(k.next());
		System.out.print("제조사 : ");
		dto.setPrdMaker(k.next());
		list.add(dto);
	}
	
	public void update() {
		ProductDto dto = null;
		System.out.print("번호 : ");
		n = k.nextInt();
		for (ProductDto productDto : list) {
			if (n == productDto.getPrdNum()) {
				dto = productDto;
				System.out.println("수정되었습니다.");
				break;
			}
		}
		
		if (dto == null) {
			System.out.println("없는 번호 입니다.");
			return;
		}
		
		System.out.print("제품명 : ");
		dto.setPrdName(k.next());
		System.out.print("가격 : ");
		dto.setPrdPrice(k.nextInt());
		System.out.print("제조일 : ");
		dto.setPrdDate(k.next());
		System.out.print("제조사 : ");
		dto.setPrdMaker(k.next());
	}
	
	public void delete() {
		System.out.print("번호 : ");
		n = k.nextInt();
		for (ProductDto productDto : list) {
			if (n == productDto.getPrdNum()) {
				list.remove(productDto);
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		
		System.out.println("없는 번호입니다.");
	}
	
	public void select() {
		for (ProductDto productDto : list) {
			System.out.println(productDto);
		}
	}
	
}
