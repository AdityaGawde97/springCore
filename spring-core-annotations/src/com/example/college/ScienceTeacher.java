package com.example.college;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {

		System.out.println("Hi i'm Science Teacher");
		
	}	
	
}
