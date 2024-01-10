package com.code;

public class ExceptionDemo {
	
	public void exception( int x,int y)
	{
		try
		{
			int rest=x/y;
			System.out.println("result="+rest);
		}
		catch(Exception e)
		{
			System.out.println("in valid input");
		}
		finally
		{
			System.out.println("the number are="+x+"and"+y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo obj=new ExceptionDemo();
		obj.exception(8, 0);
		obj.exception(4, 2);
	}

}
