package com.yeon.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import seoyeon.lee.db.manager.YeonDBManager;

public class SelectMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String url = "jdbc:oracle:thin:@192.168.0.3:1521:XE";
			con = YeonDBManager.connect(url, "tjdus", "5077");
			
			System.out.print("지점명 : ");
			String n = k.next();
			System.out.println("-----");
			
			String sql = "SELECT B_CATEGORY, AVG(B_PRICE) AS AVG_PRICE\r\n"
					+ "FROM DEC22_BOOK \r\n"
					+ "WHERE B_NO IN \r\n"
					+ "		(SELECT S_B_NO \r\n"
					+ "		FROM DEC22_SELL \r\n"
					+ "		WHERE S_K_LOCATION LIKE '%'||?||'%')\r\n"
					+ "GROUP BY B_CATEGORY";
			
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, n);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("B_CATEGORY"));
				System.out.println(rs.getInt("AVG_PRICE"));
				System.out.println("-----");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		YeonDBManager.close(con, pstmt, rs);
	}
}
