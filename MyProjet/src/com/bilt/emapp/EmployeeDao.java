package com.bilt.emapp;

import java.util.List;

import com.blit.models.Employee;

public interface EmployeeDao {
	
public void createEmployee();
	
	//show all employee
	public void showAllEmployee();
	
	//show employee based on id
	public void showEmployeeBasedOnID(int id);
	
	//update employee
	public void updateEmployee(int id,String name);
	
	//delete employee
	public void deleteEmployee(int id);

	void createEmployee(Employee emp);
	
	

}
