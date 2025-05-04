package com.ibm.AutoBoxing_UnBoxing;

public class Application
{
	public static void main( String[] args )
	{
		int a = 10;
		Integer obj = a;
		
		System.out.println("This is the Int : " + a);
		
		
		// AutoBoxing (Java automatically converts int to Integer (this is autoboxing).)
		System.out.println("Convert the int To Interger Obj : " + obj);
		
		
		//UnBoxing(Java automatically converts Integer back to int (unboxing).)
		int newobj = obj;
		
		System.out.println("Convert obj To primitive Datatyoe : " + newobj);
	}
}