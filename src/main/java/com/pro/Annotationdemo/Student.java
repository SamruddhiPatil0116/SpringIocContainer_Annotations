package com.pro.Annotationdemo;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	private int rollNumber;
	private String name;
	private String address;

	public Student() {
		System.out.println("inside no-arg constructor of Student class!!");
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		System.out.println("inside setter method of rollNumber in Student class!!");
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("inside setter method of Name in Student class!!");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("inside setter method of Address in Student class!!");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}
}