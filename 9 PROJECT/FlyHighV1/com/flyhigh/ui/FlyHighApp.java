package com.flyhigh.ui;

import com.flyhigh.model.Login;
import com.flyhigh.util.FleetMenuUtil;

public class FlyHighApp {
	public static void main(String[] args) {
		System.err.println("Welcome .....");
		Login login = new Login();
		boolean loggedIn = login.authenticate("login", "password");
		if (loggedIn) {
			FleetMenuUtil.displayFleetMenu();
			FleetMenuUtil.acceptFleetMenuChoice();
		}
	}
}


