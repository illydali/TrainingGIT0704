package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResourcesEx {
public static void main(String[] args) {
	tryWithResources();
}
	private static void beforeTryWithResources() {
		Connection sqlConnection = null;
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish connection with db url
			// <protocol>:<sub-protocol>://<server>:<port>/DBNAME
//			instance assigned to sqlConnection
			sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA", "root", "mysql");
			// create statement
			String selectQueryString = "SELECT ACTOR_ID, FIRST_NAME, LAST_NAME FROM ACTOR";
			Statement selectStatement = sqlConnection.createStatement();
			// execute query + get results
			ResultSet actorResultset = selectStatement.executeQuery(selectQueryString);
//			iterate and display result
			while (actorResultset.next()) {
				int actorId = actorResultset.getInt("ACTOR_ID");
				String firstNameString = actorResultset.getString("FIRST_NAME");
				String lastNameString = actorResultset.getString("LAST_NAME");
				System.err.println(actorId + "\t" + firstNameString + "\t" + lastNameString);
			}
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Driver could not be loaded. Pls check the jdbc library configuration");
		} catch (SQLException sqlException) {
			System.err.println("Error establishing connection : " + sqlException);
		} finally {
			try {
				if (sqlConnection != null) {
					sqlConnection.close();
				}
			} catch (SQLException sqlException) {
				System.err.println("Error closing connection : " + sqlException);
			}
		}
	}
	private static void tryWithResources() {
		
//		try (Connection sqlConnection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA", "root", "mysql");) {	
		try (Connection sqlConnection  = null) {	
			// create statement
			String selectQueryString = "SELECT ACTOR_ID, FIRST_NAME, LAST_NAME FROM ACTOR";
			Statement selectStatement = sqlConnection.createStatement();
			// execute query + get results
			ResultSet actorResultset = selectStatement.executeQuery(selectQueryString);
//			iterate and display result
			while (actorResultset.next()) {
				int actorId = actorResultset.getInt("ACTOR_ID");
				String firstNameString = actorResultset.getString("FIRST_NAME");
				String lastNameString = actorResultset.getString("LAST_NAME");
				System.err.println(actorId + "\t" + firstNameString + "\t" + lastNameString);
			}
		} catch (SQLException sqlException) {
			System.err.println("Error establishing connection : " + sqlException);
		}
		catch (NullPointerException nullPointerException) {
			System.err.println("Connection not instantiated : " + nullPointerException);
		}
	}
}
