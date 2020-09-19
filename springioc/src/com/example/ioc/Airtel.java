package com.example.ioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Airtel Sim");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Internet surfing using Airtel Sim");
	}

}
