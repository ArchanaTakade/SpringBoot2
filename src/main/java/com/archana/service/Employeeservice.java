package com.archana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


import com.archana.dao.EmpoleeRepository;
import com.archana.model.Employee;

@Service
public class Employeeservice {
	@Autowired
 EmpoleeRepository sr;

	public  String addEmployee(Employee Emp) {
		if (Emp.getName().isEmpty()) {
			System.out.println("you have to add employee name");
			return "you have to add employee name" ;
		
		}
		else {
			return  sr.toString();
		
	}
	}
}