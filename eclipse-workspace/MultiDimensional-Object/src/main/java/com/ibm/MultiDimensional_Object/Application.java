package com.ibm.MultiDimensional_Object;


class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display student info
    void display() {
        System.out.print(name + " (Roll No: " + rollNo + ")");
    }
}

public class Application
{
	public static void main( String[] args )
	{
		// 1. Create a 2D array of Student objects (2 rows, 2 columns)
        Student[][] classroom = new Student[2][2];

        // 2. Initialize each student
        classroom[0][0] = new Student("Alice", 1);
        classroom[0][1] = new Student("Bob", 2);
        classroom[1][0] = new Student("Charlie", 3);
        classroom[1][1] = new Student("Diana", 4);

        // 3. Print the classroom using enhanced for loop
        System.out.println("Classroom seating chart:");
        for (Student[] row : classroom) {
            for (Student student : row) {
                student.display();
                System.out.print("   ");
            }
            System.out.println(); // Move to next row
        }
	}
}