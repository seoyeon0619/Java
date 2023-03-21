package com.yeon.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String url = "jdbc:oracle:thin:@192.168.0.3:1521:XE";
			con = DriverManager.getConnection(url, "tjdus", "5077");

			System.out.print("지점명 : ");
			String n = k.next();

			String sql = "DELETE FROM DEC22_KYOBO WHERE K_LOCATION = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, n);
			
			if (pstmt.executeUpdate() == 1) {
				System.out.println("삭제 성공'");
			} else {
				System.out.println("해당 지점은 없습니다");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}
		k.close();
	}
}
