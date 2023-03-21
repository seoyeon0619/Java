package com.yeon.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;

public class ConnectMain {
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			// 연결할 때 쓸 드라이버 지정
			// 주소만 봐도 무슨 DB인지 알 수 있으니 Java가 주소 보고 알아서 함 
			// JSP/Spring가면 써야함 
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 연결할 DB서버 주소
			String url = "jdbc:oracle:thin:@192.168.0.3:1521:XE";
			
			// 연결
			con = DriverManager.getConnection(url, "tjdus", "5077");
			System.out.println("성공");
			
		} catch (Exception e) {e.printStackTrace();}
		
		try {con.close();} catch (Exception e) {}

	}
}
