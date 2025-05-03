package com.ibm.string_pool;

public class Application
{
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Hello");
		
		System.out.println("Before Adding the String: " + s);
		s.append("Aniket");
		
		System.out.println("After Adding apend: "  +  s);

    }

}