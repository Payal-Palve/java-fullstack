package com.code;

public class OverridingChild extends OverudingBase {
	
	public OverridingChild(int phone, String name) {
		super(phone, name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void eat()
	{
		System.out.println("eat method callled in child");
	}
    
	
	public static void demo()
	{
		System.out.println("hello static method child");
	}
}
