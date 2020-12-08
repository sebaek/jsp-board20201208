package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtil {
		
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
