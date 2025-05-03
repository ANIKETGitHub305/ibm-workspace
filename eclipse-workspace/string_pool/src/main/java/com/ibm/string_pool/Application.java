package com.ibm.string_pool;

public class Application
{
	public static void main(String[] args) {
		// 1. Creating strings
        String name = "Alice";
        String greeting = "Hello";

        // 2. Concatenation (joining strings)
        String message = greeting + ", " + name + "!";
        System.out.println("Message: " + message);

        // 3. String length
        System.out.println("Length of message: " + message.length());

        // 4. Substring (part of the string)
        String part = message.substring(7, 12); // from index 7 to 11
        System.out.println("Substring (7 to 11): " + part);

        // 5. Changing case
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());

        // 6. Comparing strings
        String anotherGreeting = "hello";
        boolean isEqual = greeting.equals(anotherGreeting);
        boolean isEqualIgnoreCase = greeting.equalsIgnoreCase(anotherGreeting);

        System.out.println("Are they equal (case-sensitive)? " + isEqual);
        System.out.println("Are they equal (ignore case)? " + isEqualIgnoreCase);

        // 7. Checking if a string contains a word
        System.out.println("Does message contain 'Alice'? " + message.contains("Alice"));

    }

}