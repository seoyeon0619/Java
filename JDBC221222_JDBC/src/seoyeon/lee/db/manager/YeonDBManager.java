package seoyeon.lee.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class YeonDBManager {
	public static Connection connect(String url, String id, String pw) throws SQLException {
		return DriverManager.getConnection(url, id, pw);
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {rs.close();} catch (Exception e) {}
		try {pstmt.close();} catch (Exception e) {}
		try {con.close();} catch (Exception e) {}
	}
}
