package comTest.code;
import java.util.*;

import com.code.Student;
import com.menu.*;

public class StudentTest {

	public static void main(String[] args) {
	
		try (Scanner std = new Scanner(System.in)) {
			Stdutil obj=new Stdutil();
			boolean flag=true;
			do {
				System.out.println("\n\n1.All student \n2.add student\n3.update student \n4.delete record\n5.exit");
				System.out.println("\n select option");
				int ch=std.nextInt();
				LinkedList <Student>list=Stdutil.getdata();
				switch(ch)
				{
				case 1:System.out.println("list of student="+list);break;
				case 2:obj.addstd();System.out.println("list of student="+list);break;
				case 3:System.out.println("enter Id of student to update record");
				       int num=std.nextInt();
				       for(Student s:Stdutil.getdata())
				       {
				    	   if(s.getId()==num)
				    	   {
				    		   obj.updatestd(s);
				    	   }
				       }
				       System.out.println("list of student="+list);
				
				break;
				case 4:System.out.println("enter Id of student to delete record");
				int num1=std.nextInt();
			       for(Student s:Stdutil.getdata())
			       {
			    	   if(s.getId()==num1)
			    	   {
			    		   obj.deleteStudent(s);;
			    	   }
			       }
			       System.out.println("list of student="+list);
			     
			     break;
			     case 5: flag=false;
			             break;
			     default:System.out.println("invalid");break;
				}
			}while(flag);
		}
		

	

}
}
