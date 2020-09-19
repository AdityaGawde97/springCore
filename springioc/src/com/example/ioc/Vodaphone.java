package com.example.ioc;

public class Vodaphone implements Sim {
	
	@Override
	public void calling() {
		System.out.println("Calling using Vodaphone Sim");
		
	}

	@Override
	public void data() {
		System.out.println("Internet surfing using Vodaphone Sim");
	}
	
}
