package com.code;

public abstract class AbstractBase {

	private int number=67;
	
	public AbstractBase()
	{
		number=90;
		
	}
	public AbstractBase(int number)
	{
		this.number=number;
		
	}
	abstract public void accept();
	
	public void demo()
	{
		System.out.println("hello base there");
	}
	
	public static void Static()
	{
		System.out.println("static block of base class");
	}
}
