package com.code;

public class SmartPhone extends MobilePhone {

	private int price;
	
	public SmartPhone()
	{
		price=9000;
	}
	@Override
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("video calling");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("\nprice="+price);
	}

}
