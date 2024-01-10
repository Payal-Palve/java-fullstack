package com.code;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() 
	{
		day=2;
		month=3;
		year=2024;
	}
	public Date(int d,int m,int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}
	
	public String toString()
	{
		return ("date="+day +"/"+month+"/"+year);
	}
	

}
