package com.exapmle.loadingFromProperties;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;

	@Value("${student.course}")
	private String course;

	@Value("${student.hobby}")
	private String hobby;
	
	/*
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	@Value("${student.course}")
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Required
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	} */
	
	
	public void displayInfo() {
		System.out.println("\nName:- "+name+"\nCourse:- "+course+"\nHobby:- "+hobby);
	}
}
