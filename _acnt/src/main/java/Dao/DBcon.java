package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {
	public static Connection getConnection() throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/test", "root", "1234");
		if(con != null) {
			System.out.println("마리아 DB");
		}
		return con;
	}
}
