package com.example.di;

public class Student {

	private String studentName;
	private int id;
	
	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}
	
	public void displayInfo() {
		System.out.println("Student Name is:- "+studentName);
		System.out.println("Id is:- "+id);
	}

	
}
