
package com.bilt.emapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCconnection {

	public static Connection getConnection() throws SQLException {
		/*
		 * Traditionally, the Driver Manager had 
		 * to be made aware of the dialect Driver.
		 * This is no longer necessary usually but
		 * you will probably still encounter it.
		 */
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//credentials
		String location = "jdbc:mysql://localhost:3306/demos";
		String username = "root";
		String password = "password";
		
		return DriverManager.getConnection(location, username, password);
	}
	
	public static void main(String[] args) {
		try {
			Connection conn = getConnection();
			System.out.println("Connection successful: "+conn);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}