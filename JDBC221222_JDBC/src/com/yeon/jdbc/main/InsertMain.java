package com.yeon.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 연결
			String url = "jdbc:oracle:thin:@192.168.0.3:1521:XE";
			con = DriverManager.getConnection(url, "tjdus", "5077");
			
			// 데이터 확보
			System.out.print("지점명 : ");
			String n = k.next();
			System.out.print("주소 : "); 
			String a = k.next();
			System.out.print("매장 크기 : ");
			int s = k.nextInt();
			
			// SQL (미완성) - 값이 들어갈 부분은 ?로 처리
			// 물음표 순서대로 1, 2, 3
			// ; 빼고
			String sql = "INSERT INTO DEC22_KYOBO VALUES (?, ?, ?)" ;
			
			// DB 관련 작업들을 모두 해주는 일회용 매니저
			pstmt = con.prepareStatement(sql);
			// 1. SQL 완성 : pstmt.setXXX(번호, 값);
			pstmt.setString(1, n);
			pstmt.setString(2, a);
			pstmt.setInt(3, s);
			
			// 2. DB서버로 전송
			// 3. 원격실행
			// 4. 결과 받아오기 
			int row = pstmt.executeUpdate();
			
			if (row == 1) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 안쪽에서부터 닫기 
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}
		k.close();
	}
}
