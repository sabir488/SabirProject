package com.xavient.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xavient.model.Employee;

@RestController
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/")
	public List<Employee> getEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "lokesh", "gupta", "howtodoinjava@gmail.com"));
		return employeesList;
	}

	@RequestMapping("/employeesList")
	public List<Employee> getNewEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "gaurav", "gupta", "howtodoinjava@gmail.com"));
		employeesList.add(new Employee(2, "saurav", "gupta", "howtodoinjava@gmail.com"));
		employeesList.add(new Employee(3, "nandan", "gupta", "howtodoinjava@gmail.com"));
		employeesList.add(new Employee(4, "rahul", "gupta", "howtodoinjava@gmail.com"));
		return employeesList;
	}

}
