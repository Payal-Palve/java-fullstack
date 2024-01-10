package com.code;

public class Customer {
       int customerId;
       String custname,city;
       
      Customer()
      {
    	  customerId=407;
    	  custname="raj ghosh";
    	  city="hariyana";
      }
      
      Customer(int Id,String name,String c)
      {
    	  customerId=Id;
    	  custname=name;
    	  city=c;
      }
       
      public void print()
      {
    	  System.out.println("customerId="+customerId+" name="+custname+" location="+city);
      }
      
      public static void main(String []args)
      {
    	  Customer cust=new Customer();
    	  cust.print();
    	  
    	  Customer cust2=new Customer(45,"harry hupp","pune");
    	  cust2.print();
      }
}
