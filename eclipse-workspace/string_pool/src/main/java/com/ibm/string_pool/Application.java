package com.ibm.string_pool;

public class Application
{
	public static void main(String[] args) {
		
		
        StringBuilder sb = new StringBuilder("My Name");
        System.out.println("Initial StringBuilder: " + sb);

        // Append a string to the StringBuilder
        sb.append(" is Aniket.");
        System.out.println("After append: " + sb);

    }

}