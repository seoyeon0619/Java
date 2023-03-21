package com.yeon.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String url = "jdbc:oracle:thin:@192.168.0.3:1521:XE";
			con = DriverManager.getConnection(url, "tjdus", "5077");

			String sql = "SELECT * FROM DEC22_KYOBO ORDER BY K_LOCATION";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			// rs.next() 커서를 다음 데이터로
			// 다음 데이터가 없으면 false 
			while (rs.next()) {
				// rs.getXXX("필드명")
				System.out.println(rs.getString("K_LOCATION"));
				System.out.println(rs.getString("K_ADDRESS"));
				System.out.println(rs.getInt("K_SIZE"));
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
