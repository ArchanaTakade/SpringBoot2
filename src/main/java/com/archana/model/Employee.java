package com.archana.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class Employee {
	
	
	@Autowired
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String  name; 
	private String companyname;
	private String city;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Employee() {}
	public Employee(long id, String name, String companyname, String city) {
		
		this.Id = Id;
		this.name = name;
		this.companyname = companyname;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", companyname=" + companyname + ", city=" + city + "]";
	}

	
	
}
	
	
	


