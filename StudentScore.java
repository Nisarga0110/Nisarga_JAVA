package Nisarga;
//import java.util.Scanner;

public class StudentScore {

    public static void main(String[] args) {

       

        // Reading command-line arguments
        String name = args[0];
        int english = Integer.parseInt(args[1]);
        int maths = Integer.parseInt(args[2]);

        // Calculations
        int total = english + maths;
        float percentage = total / 2.0f;

        // Grade calculation
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Creating student object (for Garbage Collection demo)
        Student student = new Student(name, english, maths);
        student = null; // Eligible for Garbage Collection

        // Output
        System.out.println("Student: " + name);
        System.out.println("English: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

// Supporting class
class Student {
    String name;
    int english;
    int maths;

    Student(String name, int english, int maths) {
        this.name = name;
        this.english = english;
        this.maths = maths;
    }
}

