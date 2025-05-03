package com.ibm.string_pool;

public class Application
{
	public static void main(String[] args) {
        // String literals (stored in the string pool)
        String str1 = "Hello";
        String str2 = "Hello";

        // New String object (not in the string pool, stored in heap)
        String str3 = new String("Hello");

        // Check references using ==
        System.out.println("str1 == str2: " + (str1 == str2)); // true (same pool reference)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different memory locations)

        // Check content using equals()
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same content)

        // Interning str3 to move it to the pool
        String str4 = str3.intern();
        System.out.println("str1 == str4: " + (str1 == str4)); // true (both from the pool now)
    }

}