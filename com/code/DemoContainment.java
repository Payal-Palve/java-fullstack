package com.code;

public class DemoContainment {
	
	private int number;
	private String name;
	private String address;
	
	
	public DemoContainment(int num,String name,String add)
	{
		this.number=num;
		this.name=name;
		this.address=add;
	}

	public int getNum()
	{
		return number;
	}
	public void setNum(int num)
	{
		number=num;
	}
	public String getname()
	{
		return name;
	}
	
	public String toString()
	{
		return("id="+number+"\n name="+name+"\naddres="+address);
	}
}
