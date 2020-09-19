package com.example.autowired;

public class Heart {
	
	private String animal;
	private int noOfHeart;

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public void pump() {
		System.out.println("Your heart is pumping");
		System.out.println("Alive");
	}
	
}
