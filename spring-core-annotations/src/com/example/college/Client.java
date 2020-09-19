package com.example.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("Bean loaded");
		
		College college = context.getBean("college", College.class);
		System.out.println("Object:- "+college);
		college.test();
		context.close();
	}
	
}
