package com.flyhigh.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.ValueExp;

import com.flyhigh.util.DBUtil;

public class FlightMySQLRepository {
	public static boolean authenticate(String loginId, String password ) {
     boolean valid = false;
		try {
			// create statement
			String selectQueryString = "SELECT LOGIN_ID, PASSWORD FROM LOGIN WHERE LOGIN_ID = '" + loginId +"' AND PASSWORD = '" + password + "'";
			ResultSet actorResultset = DBUtil.getResultSet(selectQueryString);
//			iterate and display result
			while(actorResultset.next()) {
				String loginIdDB = actorResultset.getString("LOGIN_ID");
				String passwordDB = actorResultset.getString("password");
				if(loginId.equals(loginIdDB) && password.equals(passwordDB)) {
					valid = true;
					break;
				}
			}
		}  catch (SQLException sqlException) {
			System.err.println("Error establishing connection : " + sqlException);
		}
		return valid;
	}
}
