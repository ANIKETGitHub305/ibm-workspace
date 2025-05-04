package com.ibm.Enum;

public class Application
{
	// Define an enum called Day
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Create a variable of type Day
        Day today = Day.FRIDAY;

        // Use enum in a switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week.");
                break;
            case FRIDAY:
                System.out.println("Last working day!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a regular weekday.");
        }
    }
}
	    
	   
