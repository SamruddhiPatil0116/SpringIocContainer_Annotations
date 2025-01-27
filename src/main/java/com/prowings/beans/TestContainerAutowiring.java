package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainerAutowiring {
	
		
		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

			Employee e = context.getBean("Employee", Employee.class);
			System.out.println("Employee Bean" +e);
		}

	
}
