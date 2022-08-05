package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@GetMapping("/employees")
	public String getWelcomeMessage() {
		return "Welcome to Spring Boot REST API";
	}

	@GetMapping("/employee")
	public String getEmployee() {
		return "{id : 1}";
//		return new Employee(5, "JumboJets", 5);
	}
	@GetMapping("/employeeModel")
	public List getEmployeeModel() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add( new Employee(5, "JumboJets", 55));
		employeeList.add( new Employee(5555, "JumboJets", 55));
//		return "{id : 1}";
		return employeeList;
	}
}
