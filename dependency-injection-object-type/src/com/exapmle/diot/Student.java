package com.exapmle.diot;

public class Student {

	private MathCheat mathCheat;
	private int id;
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void cheating() {
		mathCheat.mathCheat();
		System.out.println("My id is :- "+id);
	}
	
}
