package com.exapmle.diot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = context.getBean("stu", Student.class);
		student.cheating();
		
		AnotherStudent as = context.getBean("an", AnotherStudent.class);
		as.startCheating(); 
		
	}
	
}
