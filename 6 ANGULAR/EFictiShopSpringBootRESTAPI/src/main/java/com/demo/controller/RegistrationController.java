package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.entity.Registration;
import com.demo.service.RegistrationService;

import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {
	// Dependency Injection (spring framework creates the Repository internally and
	// injects the instance into your app
	@Autowired
	private RegistrationService registrationService;

	@PostMapping("/registrations")
	public Registration createRegistration(@RequestBody Registration registration) {
	System.out.println("Registration : " + registration);
		Registration savedRegistration = registrationService.save(registration);
		return savedRegistration;
	}

	@GetMapping("/registrations/{email}/{password}")
	public Boolean authenticate(@PathVariable(value="email") String email,@PathVariable(value="password") String password) {
		Boolean authenticated =  registrationService.isValidUser(email, password);
		System.out.println("RegistrationController - authenticate " + authenticated);
		return authenticated;
	}
}
