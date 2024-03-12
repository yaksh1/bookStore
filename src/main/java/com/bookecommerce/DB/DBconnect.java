package com.bookecommerce.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	private static Connection con;
	
	public static Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ebook_store";
		String user ="root";
		String password="ygandhi123";
		
		con=DriverManager.getConnection(url,user,password);
		
		return con;
	}
}
