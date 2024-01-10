package com.code;

public class Dell extends Computer {

	private String processor;
	
	public Dell()
	{
		super();
		processor="I5 gen";
	}
	
	public Dell(Computer c,String p)
	{
		super();
		this.processor=p;
		
	}
	
	public String toString()
	{
		return(super.toString()+"\nprocessor="+processor);
	}
}
