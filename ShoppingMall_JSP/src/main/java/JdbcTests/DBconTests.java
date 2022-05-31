package JdbcTests;

import java.sql.Connection;

public class DBconTests {
	
	public static void main(String[] args) throws Exception {
		
		Connection con = DBcon.getConnection();
	}
}
