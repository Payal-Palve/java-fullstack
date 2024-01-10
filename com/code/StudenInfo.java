package com.code;

public class StudenInfo {
	
	private String studentName;
	private int studentId;
	private int studentMarks;
	
	public void accept(String name,int id,int mark) {
		studentName=name;
		studentId=id;
		studentMarks=mark;
		
		
	}
	public void details() {
		System.out.println("name of the student"+studentName+" "+" studentid="+studentId+"Marks="+studentMarks);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudenInfo std1= new StudenInfo();
		std1.accept("jhon max", 123, 250);
		std1.details();

	}

}
