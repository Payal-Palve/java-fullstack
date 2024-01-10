package com.code;

public class Computer extends ElectronicDevice {

	private String company;
	
	public Computer()
	{
		super();
		company="Dell";
	}
	
	public Computer(String dev,int pr,String col,String comp)
	{
		super(dev,pr,col);
		this.company=comp;
	}
	
	public String toString()
	{
		return (super.toString()+"\ncompany="+company);
	}
}
