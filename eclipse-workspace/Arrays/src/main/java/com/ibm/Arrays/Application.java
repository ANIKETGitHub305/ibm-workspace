package com.ibm.Arrays;

public class Application
{
	public static void main( String[] args )
	{
		// 1. Declaring and initializing an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Accessing elements using index
        System.out.println("First number: " + numbers[0]); // Index starts at 0
        System.out.println("Third number: " + numbers[2]);

        // 3. Finding the length of the array
        System.out.println("Length of the array: " + numbers.length);

        // 4. Looping through the array using for loop
        System.out.println("All numbers using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // 5. Looping through the array using enhanced for loop (foreach)
        System.out.println("All numbers using foreach loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // 6. Changing a value in the array
        numbers[2] = 99;
        System.out.println("After changing third number: " + numbers[2]);
	}
}