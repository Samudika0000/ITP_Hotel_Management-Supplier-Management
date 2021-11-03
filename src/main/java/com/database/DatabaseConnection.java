package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static String url = "jdbc:mysql://localhost:3306/hotel";
	private static String userName = "root";
	private static String password = "#*samuAru12";
	private static Connection con;

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = (Connection) DriverManager.getConnection(url, userName, password);
			
		}
		catch (Exception e) {
			System.out.println("Database connection is not success!!!");
		}
		
		return con;
	}
}
