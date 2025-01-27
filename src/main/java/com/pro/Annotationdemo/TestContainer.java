package com.pro.Annotationdemo;



import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*
		 * Student ss1 = context.getBean("student", Student.class);
		 * System.out.println("Student s = "+ss1);
		 * 
		 * Student ss2 = context.getBean("student", Student.class);
		 * System.out.println("Student s = "+ss2);
		 */
		//System.out.println(">>>>>>>>"+ (ss1 == ss2));
		
		Student s1 = context.getBean("student1", Student.class);
		System.out.println("Student s1 = "+s1);

		Student s2 = context.getBean("student2", Student.class);
		System.out.println("Student s2 = "+s2);
		
		Student s3 = context.getBean("student3", Student.class);
		System.out.println("Student s3 = "+s3);
		
		System.out.println(context.getBeanDefinitionCount());
		String[] beanNames = context.getBeanDefinitionNames();
		
		System.out.println("Bean Names in container : "+Arrays.toString(beanNames));
	}

}