package com.revature.P0.dao;
import java.sql.*;
import java.sql.SQLException;


public class DAOUtilities {

	private static final String CONNECTION_USERNAME = "nchxvmgr";
	private static final String CONNECTION_PASSWORD = "jVzpvpStM8QG0tmgwjOIjFK6E9uRmRkF";
	private static final String URL = "jdbc:postgresql://ruby.db.elephantsql.com:5432/nchxvmgr";

	private static Connection connection;
	
	
	public static synchronized Connection getConnection() throws SQLException {
		if (connection == null) {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Could not register driver!");
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		
		//If connection was closed then retrieve a new connection
		if (connection.isClosed()){
			//System.out.println("getting new connection...");
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		return connection;
	}
}
