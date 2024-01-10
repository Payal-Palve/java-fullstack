package com.menu;

public class ExceptionDemo {
	
	public int evenOdd(int x)
	{
		try
		{
			if(x%2!=0)
			{
				throw new ArithmeticException("its odd number");
			}
			else
				return x;
		}
			catch( ArithmeticException e)
			{
				System.err.println("error: "+e.getMessage());
			}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo obj=new ExceptionDemo();
		int evenodd=obj.evenOdd(1);
		System.out.println(evenodd);
		int evenodd1=obj.evenOdd(2);
		System.out.println(evenodd1);

	}

}
