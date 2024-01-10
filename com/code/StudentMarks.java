package com.code;

public class StudentMarks {
	
	public void StdMarks(String studentName,int...marks)
	{
		 System.out.println("Student Name: " + studentName);
	        System.out.print("Marks: ");
	        
	        for (int mark : marks) {
	            System.out.print(mark + " ");
	        }
	}
	
	//to check even odd using args
	public void Evenodd(int ...num)
	{
		System.out.println("\n\nto check odd even number");
		for (int number:num)
		{
			if(number%2==0)
				System.out.println("number is even="+number+" ");
			else
				System.out.println("number is odd="+number+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentMarks std1=new StudentMarks();
		std1.StdMarks("harsh",45,67,78,56,8,9,89);
		std1.Evenodd(34,6,7,8,9,4,2,1,0,89,67,54,44,22);
		

	}

}
