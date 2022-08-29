package com.demo.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Registration;
import com.demo.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	// Dependency Injection (spring framework creates the Repository internally and
	// injects the instance into your app
	@Autowired
	private RegistrationRepository registrationRepository;

	@Override
	public Registration save(Registration registration) {
		// SECURE THE PASSWORD AND STORE IN DB
		// if registration exists return error / null
		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(registration.getPassword().getBytes());
			byte[] resultByteArray = messageDigest.digest();
			StringBuilder sb = new StringBuilder();
			for (byte b : resultByteArray) {
				sb.append(String.format("%02x", b));
			}
			String hashedPassword = sb.toString();
			registration.setPassword(hashedPassword);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("No Such Algorithm...");
		}
		Registration savedRegistration = registrationRepository.save(registration);
		return savedRegistration;
	}

	@Override
	public Registration findByEmailAndPassword(String email, String password) {
		return registrationRepository.findByEmailAndPassword(email, password);
	}

	@Override
	public Registration findByEmail(String email) {
		return registrationRepository.findByEmail(email);
	}
	
	@Override
	public Boolean isValidUser(String email, String password) {
		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(password.getBytes());
			byte[] resultByteArray = messageDigest.digest();
			StringBuilder sb = new StringBuilder();
			for (byte b : resultByteArray) {
				sb.append(String.format("%02x", b));
			}
			String hashedPassword = sb.toString();
			// UUID uuid = UUID.randomUUID();
			// System.out.println("UUID=" + uuid.toString() );
			Registration registration = findByEmailAndPassword(email, hashedPassword);
//			Registration registration = findByEmail(email);
			if (registration != null)
				return true;
			else
				return false;
		} catch (NoSuchAlgorithmException e) {
			System.out.println("No Such Algorithm...");
		}
		return false;
	}
}
