package com.code;

public class ElectronicDevice {
	private String deviceName;
	private int price;
	private String colour;
	

  public ElectronicDevice()
  {
	  deviceName="mobile";
	  price=12000;
	  colour="black";
  }
  
  public ElectronicDevice(String device,int pr,String col)
  {
	  this.deviceName=device;
	  this.price=pr;
	  this.colour=col;
  }
  
  public String toString()
  {
	  return("\nDevice name="+deviceName+"\n product price="+price+"\nproduct colour="+colour);
  }
}
