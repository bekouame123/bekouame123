package com.bilt.emapp;

import java.util.Scanner;

import com.blit.models.Employee;


public class Main { // Corrected class name and method signature
    
    public static void main(String[] args) { // Corrected method signature
        
        
    	String name;
    	
    	int Id = 0;

        Employee dao = new Employee();
        
        Employee emp = new Employee();


        System.out.println("Welcome to Employee management application"); // Added semicolon

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("1. Add Employee \n" +
                    "2. Show All Employee \n" +
                    "3. Show Employee based on id\n" +
                    "4. Update the employee \n" +
                    "5. Delete the employee \n");

            System.out.println("Enter Choice:");

            int ch = sc.nextInt(); // Added semicolon

            double salary;
			switch (ch) {
                case 1:

                    System.out.println("Enter Id:");
                     Id = sc.nextInt();

                    System.out.println("Enter Name");
                    String name1 = sc.next();

                    System.out.println("Enter Salary");
                      salary = sc.nextDouble();

                    System.out.println("Enter Age"); // Added missing semicolon
                    int age = sc.nextInt();

                    emp.setId(Id);
                    emp.setName(name1);
                    emp.setSalary(salary);
                    
                    emp.setAge(age);

                    dao.createEmployee(emp);
                    break;

                case 2:
                    dao.showAllEmployee();
                    break;

                case 3:
                	System.out.println("Enter id to show details");
                	int empid=sc.nextInt();
                	
                	dao.showEmployeeBasedOnID(empid);
                	break;
                case 4:
                	System.out.println("Enter id to update the details");
                	
                	int empid1=sc.nextInt();
                	
                	dao.updateEmployee(empid1);
                	
                	name1=sc.next();
                	
                	break;
                case 5:
                	System.out.println("Enter the id to delete the details");
                	
                	Id=sc.nextInt();
                	
                	dao.deleteEmployee(Id);
                	
                	name1=sc.next();
                	
                	
                	
                    System.out.println("Thank you for using our application !!!");
                    System.exit(0); // Corrected argument
                default:
                    System.out.println("Enter valid choice!");
                    break;

            }

        } while (true);

    }

}