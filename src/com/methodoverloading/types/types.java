package com.methodoverloading.types;

 class actor{
	void ajith(int a,int b) //length of arg
	{
		System.out.println("Favourite actor for pavithra");
		
	}
	void ajith(int age) //type of arg
	{ 
		System.out.println("Age is :45");
		
	}
	void ajith(String s,int a) //sequence of arg 
	{ 
		System.out.println("fav heroine nayanthara,35");
		
	}
}
	public class types 
	{
		public static void main(String[] args)
		{
			actor fav=new actor();
			fav.ajith(45);
			fav.ajith(45,35);
			fav.ajith("pavi",34);
		}
	}
