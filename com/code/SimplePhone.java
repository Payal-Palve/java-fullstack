package com.code;

public class SimplePhone extends MobilePhone {

	private int price;
	@Override
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("audio calling\n");
	}
	
	public SimplePhone()
	{
		price=7000;
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("price="+price);
	}

}
