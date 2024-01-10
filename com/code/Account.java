package com.code;

public class Account {
	int accNo;
	String ownerName;
	double balance;
	
	public Account()
	{
		 accNo=5089;
		ownerName="ramesh gound";
		balance=5689.098d;
	}
	public Account(int a,String o,double b)
	{
		accNo=a;
		ownerName=o;
		balance=b;
	}
	
	//getter setter method
	
	public int getAccNo()
	{
		return accNo;
	}
     public void setAccNo(int accno)
    {
	   accNo=accno;
    }
    public String getOwnerName()
    {
    	return ownerName;
    }
    public void setOwnerName(String owner)
    {
    	ownerName=owner;
    }
    public double getBalance()
    {
    	return balance;
    }
    public void setBalance(double d)
    {
    	balance=d;
    }
    
    public String toString()
    {
    	return ("account number="+accNo+" "+"account name="+" "+ownerName+" "+"account balance="+balance);
    }
}
