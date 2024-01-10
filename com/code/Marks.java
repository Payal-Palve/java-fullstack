package com.code;

public class Marks {
	
	private int id;
	private float marks;
	
	
	public Marks(int id,float marks)
	{
		this.id=id;
		this.marks=marks;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public String toString()
	{
		return ("\n id="+id+"\nmarks="+marks);
	}

}
