package reply.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReplyDao {

	public void insert(Connection conn, String userId, int articleNo, String body) throws SQLException {
		// 11g
		/*
		String sql = "INSERT INTO reply "
				+ "(replyid, memberid, article_no, body, regdate) "
				+ "VALUES (reply_seq.nextval, ?, ?, ?, SYSDATE)";
		*/
		
		String sql = "INSERT INTO reply "
				+ "(memberid, article_no, body, regdate) "
				+ "VALUES (?, ?, ?, SYSDATE)";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, userId);
			pstmt.setInt(2, articleNo);
			pstmt.setString(3, body);
			
			pstmt.executeUpdate();
		}
	}
	
}
