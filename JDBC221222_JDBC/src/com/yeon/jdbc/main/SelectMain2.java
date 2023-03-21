package com.yeon.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SelectMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String url = "jdbc:oracle:thin:@192.168.0.3:1521:XE";
			con = DriverManager.getConnection(url, "tjdus", "5077");
			
			System.out.print("지점명 : ");
			String n = k.next();
			System.out.println("-----");
			
			String sql = "SELECT B_TITLE, B_CATEGORY, B_PRICE, B_DATE \r\n"
					+ "FROM DEC22_BOOK \r\n"
					+ "WHERE B_NO IN \r\n"
					+ "		(SELECT S_B_NO \r\n"
					+ "		FROM DEC22_SELL \r\n"
					+ "		WHERE S_K_LOCATION  LIKE '%'||?||'%'"
					+ ")";
			
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, n);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E)");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("B_TITLE"));
				System.out.println(rs.getString("B_CATEGORY"));
				System.out.println(rs.getInt("B_PRICE"));
				System.out.println(sdf.format(rs.getDate("B_DATE")));
				System.out.println("-----");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {rs.close();} catch (Exception e) {}
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}
	}
}
