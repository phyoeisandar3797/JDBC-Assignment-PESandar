package com.pesandar.schoolmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
private ConnectionManager() {
		
	}
	private static final String URL ="jdbc:mysql://localhost:3306/schoolmanagement_db";
	private static final String USER = "root";
	private static final String PASSWORD ="admin";
	
	public static Connection getInstance() throws SQLException {
		return DriverManager.getConnection(URL,USER,PASSWORD);
		
	}

}
