package com.code;

public class Employee {
	private int id;
	private String name;
	private Date birthdate;  //creating object of date
	
	public Employee()
	{
		id=901;
		name="jagdhane";
		birthdate=new Date();
		
	}
	public Employee(int id,String name,Date dt)
	{
		this.id=id;
		this.name=name;
		birthdate=dt;
	}
	
	public String toString()
	{
		return ("id="+id+"name"+name+"birthdate"+birthdate);
	}

}
