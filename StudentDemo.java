// Filename: StudentDemo.java

// This program demonstrates classes, objects, and basic OOP concepts in Java.

import java.util.Scanner;

// Class definition
class ClassAndObject {  // Class names should start with uppercase by convention
    // Attributes / Fields
    String name;
    int age;
    String course;

    // Constructor to initialize a new ClassAndObject object
    ClassAndObject(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("------------------------");
    }

    // Method to check if the student is eligible for an exam (age > 18)
    boolean isEligibleForExam() {
        return age > 18;
    }
}

// Main class to run the program
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating objects of ClassAndObject class
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        ClassAndObject[] students = new ClassAndObject[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Course: ");
            String course = sc.nextLine();

            // Creating new ClassAndObject object
            students[i] = new ClassAndObject(name, age, course);
        }

        System.out.println("\n--- Student Details ---");
        for (ClassAndObject s : students) {
            s.displayInfo();
            if (s.isEligibleForExam()) {
                System.out.println(s.name + " is eligible for the exam.");
            } else {
                System.out.println(s.name + " is NOT eligible for the exam.");
            }
            System.out.println();
        }

        sc.close();
    }
}