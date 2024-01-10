package com.code;

public class Arithmetic {
	
	public void multiply(int x,int y,int z)
	{
		System.out.println("multiplication="+(x*y*z));
	}
	
	public void multiply(float x,int y,int z)
	{
		System.out.println("multiplication="+(x*y*z));
	}
	
	public void multiply(int x,double y,int z)
	{
		System.out.println("multiplication="+(x*y*z));
	}
	public void multiply(int x,int y,float z)
	{
		System.out.println("multiplication="+(x*y*z));
	}
	
	public static void main(String []args)
	{
		Arithmetic mul=new Arithmetic();
		mul.multiply(0.4f, 50, 20);
		mul.multiply(4,56, 40);
		mul.multiply(43, 0.45d, 20);
		mul.multiply(3, 20, 0.68f);
	}
	
}



