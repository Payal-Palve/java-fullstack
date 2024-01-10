package comTest.code;

import com.menu.*;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<10;i++)
		{
			Thread1 th=new Thread1();
			th.start();
			
		}
	}

}
