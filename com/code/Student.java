package com.code;

public class Student {
	
	private int Id;
	private String name;
	private float percentage;
    private static int num; 
	
	
	static {
		num=1;
	}
	public Student()
	
    {   Id=num;
		name="xyz";
		percentage=56;
		num++;
	}

	public Student(String name, float percentage) {
		
		
		this.Id=num;
		this.name = name;
		this.percentage = percentage;
		num++;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String toString()
	{
		return ("\nId of student="+Id+"\n Name of student="+name+"\npercentage of student="+percentage);
		
	}
}
