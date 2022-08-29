package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, String> {
Registration findByEmailAndPassword(String email, String password);
Registration findByEmail(String email);
}