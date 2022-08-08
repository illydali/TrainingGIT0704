package com.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeControllerDb {
// Dependency Injection (spring framework creates the Repository internally and injects the instance into your app
@Autowired
private EmployeeRepository employeeRepository;
	@GetMapping("/employees")
	public List getEmployeeList() {
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}

}
