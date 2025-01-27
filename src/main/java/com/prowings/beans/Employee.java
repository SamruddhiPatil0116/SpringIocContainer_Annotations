package com.prowings.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Employee")
public class Employee {

	@Value("10")
	private int id;
	@Value("Er.Sarvesh")
	private String name;
	//@Autowired
	private Department department;  // Field Injection
	
	
	public Employee() {
		super();
		System.out.println("Employee no-arg constructor invoked");
	}
	
	//@Autowired
	public Employee(Department department) {
		super();
		System.out.println("Employee department constructor invoked");
		this.department = department;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Employee setter for id invoked");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee setter for name invoked");
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	
	@Autowired
	public void setDepartment(Department department) {
		System.out.println("Employee setter for department invoked");
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
