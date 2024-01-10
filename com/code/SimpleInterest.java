package com.code;

public class SimpleInterest {
	
	private int principale;
	private int time;
	private float rate;
	
	
	public void accept1(int p,int t,double d) {
		principale=p;
		time=t;
		rate=(float) d;
		
		
	}
	public void display1() {
		float interest=(principale*time*rate)/100;
		System.out.println("simple interesr ="+interest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SimpleInterest obj= new SimpleInterest();
         obj.accept1(10000, 5,0.2);
         obj.display1();
	}

}
