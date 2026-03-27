// Filename: Attribute.java
// Ye file Java Class Attributes ke saare concepts + example code dikhati hai

class Student {
    // 1️⃣ Instance Variables (per object unique)
    String name;
    int age;

    // 2️⃣ Class Variable (shared across all objects)
    static String school = "ABC School";

    // 3️⃣ Constructor - Instance variables initialize karne ke liye
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 4️⃣ Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + school);
        System.out.println("---------------------------");
    }

    // 5️⃣ Example of checking eligibility (local variable inside method)
    void checkEligibility() {
        int requiredAge = 18;  // local variable
        if (age >= requiredAge) {
            System.out.println(name + " is eligible for the exam.");
        } else {
            System.out.println(name + " is NOT eligible for the exam.");
        }
    }
}

// ✅ Public class matching file name
public class Attribute {
    public static void main(String[] args) {
        // Creating objects (instance of Student)
        Student s1 = new Student("Sunny", 19);
        Student s2 = new Student("Rohit", 17);

        // Display info using instance method
        s1.displayInfo();
        s1.checkEligibility();

        s2.displayInfo();
        s2.checkEligibility();

        // 6️⃣ Demonstrating class variable (shared)
        System.out.println("School for all students: " + Student.school);

        // Changing class variable
        Student.school = "XYZ Academy";
        System.out.println("School changed for all students to: " + Student.school);

        // After change
        s1.displayInfo();
        s2.displayInfo();
    }
}