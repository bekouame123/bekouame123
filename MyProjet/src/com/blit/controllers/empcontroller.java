package com.blit.controllers;

import java.util.List;

import com.bilt.emapp.EmployeeService;
import com.blit.models.Employee;

public class empcontroller {
	private EmployeeService employeeService = new EmployeeService();
	
	public void SeeAddresses() {
		System.out.println("here are everyone's addresses");
		
		List<Employee> list = employeeService.findAllEmployee();
		
		for(Employee a:list) {
			System.out.println(a);
		}
		
	}
}