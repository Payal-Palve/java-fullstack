package com.menu;



public class demo {
	
	public static int demmo(int ...x)
	{
		int result = 0;
        for (int num : x) {
            result += num;
        }
       
	return result;
    }
	
	


	    public static void main(String[] args) {
	    	
	    	int []arr= {40,60};
	    	int sum=demmo(arr);
	    	System.out.println("data="+sum);
	    	
	        
	    }

}
