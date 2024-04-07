package com.bilt.emapp;

import java.util.List;
import com.blit.models.Employee;
import java.util.Collections;

public class EmployeeService {
	
	
  private EmployeeDao employee = new EmployeeDaoImpl();
    

    public List<Employee> getAllEmployee(String sortType) {
    	
        List<Employee> list ;

        if (sortType.equals("1")) {
        	
            
        } else if (sortType.equals("2")) {
        	
            Collections.sort(list, (o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
        }

        return list;
    }

    public void enrollEmployee(String name, double salary, int age) {
		
        Employee employee = new Employee(age, name, salary, age);
        
         private int getId() {
    		// TODO Auto-generated method stub
    		return 0;
    	}

    	private String getName() {
    		// TODO Auto-generated method stub
    		return null;
    	}

    	private double getSalary() {
    		return 0;
    	}

		public List<Employee> findAllEmployee() {
	        List<Employee> list =  employee.showAllEmployee();
			return list;;
		} 

    }

	