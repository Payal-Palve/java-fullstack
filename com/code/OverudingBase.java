package com.code;

public class OverudingBase {
	
	private int phone;
	private String name;
	
	public OverudingBase( int phone,String name)
	{
		this.phone=phone;
		this.name=name;
	}
	
	public void eat()
	{
		System.out.println("eat method callled in base");
	}

	public static void demo()
	{
		System.out.println("hello static method base");
	}
}
