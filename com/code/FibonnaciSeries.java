package com.code;


public class FibonnaciSeries {

	    public static void main(String[] args) {
	        
	    	
	        int n = 10;
	        printFibonacciSeries(n);
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + ""+"\n");
	        }
	    }

	    
	    public static void printFibonacciSeries(int n) {
	        int a = 0, b = 1;

	        System.out.println("Fibonacci Series:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " "+"\n");

	            int nextTerm = a + b;
	            a = b;
	            b = nextTerm;
	        }
	        System.out.println("\n");
	    }
	

	   

	    // Recursive method to calculate the nth Fibonacci number
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }


}
