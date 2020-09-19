package com.example.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	//@Value("${college.name}")
	private String collegeName;

	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

//	College(Principal principal) {
//		this.principal = principal;
//	}
	
//	@Autowired
//	public void setPrincipal(Principal principal) {
//		this.principal = principal;
//		System.out.println("using setter");
//	}
//
//	@Autowired
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}
	
	@Required
	@Value("${college.name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void test() {
		System.out.println("Testing is done");
		principal.principalInfo();
		teacher.teach();
		System.out.println("College Name:- "+collegeName);
	}
	
}
