package com.flyhigh.model;

import com.flyhigh.repository.FlightMySQLRepository;

public class Login {
	private String loginId;
	private String password;
	
	public boolean authenticate(String loginId, String password ) {
	     boolean valid = false;
	     valid = FlightMySQLRepository.authenticate("login", "password");
	     return valid;
	}
}
