package com.yeon.uc.main;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FWMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("냠 : ");
		String txt = k.next();

		// 메모장 : 실시간성 없음
		// win10 메모장이 아닌 이전 메모장에서 \n만 써놓으면 깨짐
		
		// 파일에 쓰기 편하게 OutputStreamWriter(2bytes) 개조한 FileWriter
		// 파일 없으면 만들어줌, 그러나 폴더는 안 만들어줌
		// txt를 저장할 수 있게 하는 빨대 fw
		// 차원이 다른 크기의 bw로 통로가 작은 빨대를 확장
		// bw 빨대를 다 채워야 내용이 저장될 수 있음
		// 다시 쓰고 다시 1214.txt 열면 내용이 추가되는 것이 아니라 변경됨
		// true를 쓰면 바로 뒤에 이어서 내용이 추가됨
		
		// 변수 만들고 뭐라도 넣어야 함
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("C:\\seoyeon\\Program\\1214.txt", true);
			bw = new BufferedWriter(fw);
			
			bw.write(txt + "\r\n");
			// 빨대용량 다 안차도 강제 전송
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
