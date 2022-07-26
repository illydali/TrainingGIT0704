package com.flyhigh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	public static Connection getConnection() {
		Connection sqlConnection = null;
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish connection with db url
			// <protocol>:<sub-protocol>://<server>:<port>/DBNAME
			sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "mysql");
			return sqlConnection;
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Driver could not be loaded. Pls check the jdbc library configuration");
		} catch (SQLException sqlException) {
			System.err.println("Error establishing connection : " + sqlException);
		}
//		finally {
//			try {
//				if (sqlConnection != null) {
//					sqlConnection.close();
//				}
//			} catch (SQLException sqlException) {
//				System.err.println("Error closing connection : " + sqlException);
//			}
//		}
		return null;
	}

	public static Statement getStatement() {
		Statement statement = null;
		try {
			statement = getConnection().createStatement();
			return statement;
		} catch (SQLException sqlException) {
			System.err.println("Error creating statement : " + sqlException);
		}
		return null;
	}

	public static ResultSet getResultSet(String queryString) {
		try {
//			Statement selectStatement = getStatement();
			// execute query + get results
//			ResultSet resultSet = selectStatement.executeQuery(queryString);
//				iterate and display result
//			return resultSet;
			return getStatement().executeQuery(queryString);
		} catch (SQLException sqlException) {
			System.err.println("Error fetching ResultSet : " + sqlException);
		}
		return null;
	}
}
