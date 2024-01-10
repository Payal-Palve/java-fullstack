package com.menu;

public class Thread1 extends Thread {
	
	public void run()
	{
		
			try{
				System.out.println("Thread "+Thread.currentThread().getId()+"is running...........");
			}
			catch(Exception e)
			{
				System.err.println("Error:mistaken");
			}
			
		
	}

}
