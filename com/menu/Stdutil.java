package com.menu;
import java.util.*;

import com.code.Student;


public class Stdutil {
	static LinkedList<Student> list=new LinkedList<>();
	Scanner std=new Scanner(System.in);
	
	static public LinkedList<Student>getdata()
	{
		return list;
	}
	
	public void addstd()
	{
		
		System.out.println("Enter the name ");
		String str=std.next();
		System.out.println("enter percentage");
		float per=std.nextFloat();
		list.add(new Student(str, per));
		System.out.println("\nyour record added succesfully...........");
	}
	
	public void updatestd(Student s)
	{
		
		System.out.println("enter name to update");
		String str=std.next();
	    s.setName(str);	
	    System.out.println("enter percentage to update");
	    float per=std.nextFloat();
	    s.setPercentage(per);
	    System.out.println("\nyour record updated........................");
	}
	public void deleteStudent(Student s)
	{
		list.remove(s);
	}
}
