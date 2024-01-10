package com.code;

public class Demo2Containment {
	
	private int marks;
	private DemoContainment info;
	
	public Demo2Containment()
	{
		marks=67;
		
	}
	public Demo2Containment(int marks,int num,String name,String add)
	{
		this.marks=marks;
		
		info=new DemoContainment(num,name,add);
		
	}
	public String toString()
	{
		return (info+"\nmarks="+marks);
	}
		
	public static void main(String []args)
	{
		 Demo2Containment obj=new Demo2Containment(88,1,"payal","vitthal nagar");
		 System.out.println(obj);
		
	}
	
}
