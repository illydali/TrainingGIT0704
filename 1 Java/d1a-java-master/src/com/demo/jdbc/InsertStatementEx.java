package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import java.sql.ResultSet;

public class InsertStatementEx {
	public static void main(String[] args) {

		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish connection with db url
			// <protocol>:<sub-protocol>://<server>:<port>/DBNAME
			Connection mySQLConnection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","mysql");
			// create statement
			int productId = 2;
			String productName = "Book";
			float price = 50.50f;
			// INSERT INTO PRODUCT VALUES (1, 'MAGAZINE',50.5);;
	
			String insertQueryString = " INSERT INTO PRODUCT VALUES (" + productId + ", '" + productName + "'," + price + ");" ;
			System.err.println(insertQueryString);
			
			Statement selectStatement = mySQLConnection.createStatement();
			// execute query + get results
			int rowsAffected = selectStatement.executeUpdate(insertQueryString);
//			iterate and display result
			if(rowsAffected > 0) {
				System.err.println("Successfully Inserted record!");
			}
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Driver could not be loaded. Pls check the jdbc library configuration");
		}		catch (SQLIntegrityConstraintViolationException sqlIntegrityConstraintViolationException) {
			System.err.println("Duplicate Product Id : " + sqlIntegrityConstraintViolationException);
		} 
		catch (SQLException sqlException) {
			System.err.println("Error establishing connection : " + sqlException);
		}
	}
}
