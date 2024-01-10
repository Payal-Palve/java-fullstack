package com.code;
import java.util.Scanner;

public class Temperature {
	


	public static void main(String[] args) {
		
		
		Temperature temp1=new Temperature();
		temp1.convert();
		
		
}
	public void convert()
	{
		System.out.println("enter the temperature in celsius");
		try (Scanner scan = new Scanner(System.in)) {
			double cel=scan.nextDouble();
			
			double fah=(cel*9/5)+32;
			
			System.out.println("converting="+fah);
		}
	}
}