package com.blit.models;

public class Employee {
	
	
	private int id;
	private String name;
	private double salary;
	private int age;

	
	public Employee() {};
	
	
	public Employee(int id, String name, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}


	public void setAge(int age2) {
		// TODO Auto-generated method stub
		
	}


	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}


	public void showAllEmployee() {
		// TODO Auto-generated method stub
		
	}


	public void showEmployeeBasedOnID(int empid) {
		// TODO Auto-generated method stub
		
	}


	public void updateEmployee(int empid1) {
		// TODO Auto-generated method stub
		
	}


	public void deleteEmployee(int id2) {
		// TODO Auto-generated method stub
		
	}
	

}
