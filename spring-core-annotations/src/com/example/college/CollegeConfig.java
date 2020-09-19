package com.example.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.college")
@PropertySource("classpath:college.properties")
public class CollegeConfig {
	
//	@Bean
//	public Teacher mathTeacherBean() {
//		return new MathTeacher();
//	}
//	
//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//	}
//	
//	@Bean
//	public College collegeBean() {
//		College college = new College();
//		college.setPrincipal(principalBean());
//		college.setTeacher(mathTeacherBean());
//		return college;
//	}
}
