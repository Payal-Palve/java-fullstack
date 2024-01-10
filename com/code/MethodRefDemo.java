package com.code;

interface foo
{
	
	public void print();
	
	
}
public class MethodRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		foo obj=MethodDemo::demo;
		obj.print();
         MethodDemo dm=new MethodDemo();
         foo obj2=dm::show;
         obj2.print();
	}

}
