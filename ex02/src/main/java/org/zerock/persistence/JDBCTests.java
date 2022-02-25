package org.zerock.persistence;


import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try(Connection con =
			DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"system",
					"1234")){
			
		log.info(con);
		System.out.println("Oracle 연결성공 ex02");
		}catch (Exception e) {
		}
	}
}
