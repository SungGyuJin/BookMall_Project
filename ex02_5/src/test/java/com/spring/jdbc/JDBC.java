package com.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBC {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCon() {
		try(Connection con = 
			DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe",
			"system",
			"1234")){
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		
}
