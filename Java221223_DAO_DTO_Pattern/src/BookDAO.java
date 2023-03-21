import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import seoyeon.lee.db.manager.YeonDBManager;

public class BookDAO {
	// 디자이너에게 줄 때 최대한 간단히 전달해야 함
	public static ArrayList<Book> getBook() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 결과
		try {
			String url = "jdbc:oracle:thin:@192.168.0.3:1521:XE";
			con = YeonDBManager.connect(url, "tjdus", "5077");
			
			String sql = "SELECT B_TITLE, B_PRICE FROM DEC22_BOOK";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Book> books = new ArrayList<>();
			while (rs.next()) {
				books.add(
						new Book(
								rs.getString("B_TITLE"), 
								rs.getInt("B_PRICE")
					)
				);
			}
			return books;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			YeonDBManager.close(con, pstmt, rs);
		}
	}
}
	

