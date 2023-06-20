package com.archana.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.archana.dao.EmpoleeRepository;
import com.archana.model.Employee;
import com.archana.service.Employeeservice;


@RestController
public class Employeecontroller {
	
	//private static final List<Employee> Array = null;
    @Autowired
    EmpoleeRepository er;
    
    @Autowired
    Employeeservice es;
    
	@PostMapping("/Empl")
	public String addEmployee(@RequestBody Employee Emp) {
		
//		if(Emp.getName().isEmpty()){
//			System.out.println("you have to add student first name");
//			return Emp;
//		}else {
//		return er.save(Emp);
//		}
//		Employeeservice er =new EmployeeService();
		
		return "you have to add employee name";
		
	}
	
	
	@GetMapping("/emp/{Id}")
	public Employee getEmployee (@PathVariable("Id") long id) {
		
		 return er.findById(id).get();
		
		 
//		Employee e1 = new Employee(1l,"kiran","tata","pune");
//		Employee e2 = new Employee(2l,"meera","infosys","banglore");
//		Employee e3 = new Employee(3l,"ritik","cognizant","chennai");
//		
//		List<Employee> employee = Arrays.asList(e1, e2, e3);
//		Employee e = null;
//		for (Employee Employee : employee) {
//			if(Employee.getId() == id) {
//			e = Employee;
//			}
//			
//			}
//		return e;
		}
	
	@GetMapping("/all-emp")
	public List<Employee> getAllEmployee(){
//		Employee e1 = new Employee(1l,"kiran","tata","pune");
//		Employee e2 = new Employee(2l,"meera","infosys","banglore");
//		Employee e3 = new Employee(3l,"ritik","cognizant","chennai");
		return (List<Employee>) er.findAll();
		//..........session
//		
//		List<Employee> employee = Arrays.asList(e1, e2, e3);
//		
//		return employee;
		
	}
	
      @GetMapping("/emp")
      public Employee getEmployee(@RequestParam("id") int id) {
    	  Employee e = new Employee(3,"vishal","mastercard","baroda");
    	  return e;
    	  
      }
	 
      @PostMapping("/Emp")
      public String addEmployee1(@RequestBody Employee e) {
      Employee emp = new Employee(e.getId(),e.getName(),e.getCompanyname(),e.getCity()) ;
    	  return "Employee" + e.getName()+ "you have to add employee name.......";
      }
    }
      
		
	


