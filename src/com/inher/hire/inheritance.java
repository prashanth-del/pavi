package com.inher.hire;

class inheritancetesting 
	{
		void test()
		{
			System.out.println("Excuting tester");
		}
	}
class devlopment extends inheritancetesting 
{
	void dev()
	{
		System.out.println("Excuting Developmemt");
	}
}
public class inheritance{
	public static void main(String[] args)
	{
		inheritancetesting ref=new devlopment(); //upcasting 
		devlopment  ref1=(devlopment)ref;

		ref1.test();
		ref1.dev();
		
	}
}



