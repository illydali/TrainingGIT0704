package com.flyhigh.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.ValueExp;

public class FlightMySQLRepository {
	public static boolean authenticate(String loginId, String password ) {
     boolean valid = false;
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish connection with db url
			// <protocol>:<sub-protocol>://<server>:<port>/DBNAME
			Connection mySQLConnection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/DEMODB","root","mysql");
			// create statement
			String selectQueryString = "SELECT LOGIN_ID, PASSWORD FROM LOGIN WHERE LOGIN_ID = '" + loginId +"' AND PASSWORD = '" + password + "'";
			Statement selectStatement = mySQLConnection.createStatement();
			// execute query + get results
			ResultSet actorResultset = selectStatement.executeQuery(selectQueryString);
//			iterate and display result
			while(actorResultset.next()) {
				String loginIdDB = actorResultset.getString("LOGIN_ID");
				String passwordDB = actorResultset.getString("password");
				if(loginId.equals(loginIdDB) && password.equals(passwordDB)) {
					valid = true;
					break;
				}
			}
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Driver could not be loaded. Pls check the jdbc library configuration");
		} catch (SQLException sqlException) {
			System.err.println("Error establishing connection : " + sqlException);
		}
		return valid;
	}
}
