package com.methodoverriding.over;

class vehicle
{
	void bike()
	{
		System.out.println("daddys bike");
		
	}
	}
class fourwheller extends vehicle
    {
	void bike() 
	{
		
    	System.out.println("modified  bike");
    }
}	
public class overriding 
{
 public static void main(String[] args)	
 {
	fourwheller fr=new fourwheller();
	vehicle vc=fr;//upcasting 
vc.bike();
 }

}
