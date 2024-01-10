package com.code;

public class ThreadDemo extends Thread{
	private int num1;
	private int num2;

	
	public ThreadDemo(int n1,int n2)
	{
		this.num1=n1;
		this.num2=n2;
	}
	@Override
	public void run()
	{
		for (int i = num1; i <= num2; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
	}
	public static void main(String[] args) {
		 Thread thread1 = new ThreadDemo(1, 5);
	        Thread thread2 = new ThreadDemo(6, 10);
	        
	        thread1.start();
	        thread2.start();
		
	}

}
