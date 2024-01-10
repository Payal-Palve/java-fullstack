package com.code;

public class InheritanceDemo extends Marks {
	private String name;

	public InheritanceDemo(int id, float marks,String name) {
		super(id, marks);
		this.name=name;
		
		
		
	}

	public String toString()
	{
		return super.toString()+"\nname="+name;
	}
	
	public static void main(String [] args)
	{
		
		InheritanceDemo obj=new InheritanceDemo(6, 78, "gudii");
		System.out.println("object="+obj);
	}

}
