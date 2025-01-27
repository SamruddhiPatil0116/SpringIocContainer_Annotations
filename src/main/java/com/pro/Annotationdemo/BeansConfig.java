package com.pro.Annotationdemo;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
	
	@Bean
	public Student student1()
	{
		Student s1 = new Student();
		s1.setRollNumber(1);
		s1.setName("Nikita");
		s1.setAddress("Sangli");
		return s1;
	}
	@Bean
	public Student student2()
	{
		Student s1 = new Student();
		s1.setRollNumber(2);
		s1.setName("Sham");
		s1.setAddress("Mumbai");
		return s1;
	}
	@Bean
	public Student student3()
	{
		Student s1 = new Student();
		s1.setRollNumber(3);
		s1.setName("Sam");
		s1.setAddress("Kolhapur");
		return s1;
	}

}