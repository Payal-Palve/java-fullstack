package com.menu;

public class Thread2 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				this.currentThread().sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.currentThread().getName());
			}
	}

}
