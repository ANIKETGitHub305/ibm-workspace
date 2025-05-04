package com.ibm.Static_Members_Control_flow;

public class Application
{
	static int i = 10;
	
	//1st Block
	static 
	{
		System.out.println(i);
		m1();
		System.out.println("This is the 1st block");
	}
	//Main Method
	public static void main( String[] args )
	{
		m1();
		System.out.println("Main Method");
	}
	//Member
	public static void m1() 
	{
		System.out.println(j);
	}
	//2nd Block
	static
	{
		System.out.println("This is the 2nd Block");
	}
	
	static int j =20;
}