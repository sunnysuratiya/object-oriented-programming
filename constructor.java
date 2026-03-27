//  CONSTRUCTOR NOTES (JAVA) 

// Constructor ek special method hota hai
// Jo object create hote hi automatically call hota hai

// Key Points:
// 1. Constructor ka naam class ke naam jaisa hota hai
// 2. Constructor ka koi return type nahi hota (not even void)
// 3. Ye automatically call hota hai jab object create hota hai
// 4. Use hota hai object ko initialize karne ke liye

//  TYPES OF CONSTRUCTORS 

// 1. Default Constructor (No parameters)
// 2. Parameterized Constructor
// 3. Constructor Overloading

// CODE START

public class constructor {

    String name;
    int age;

    // Default Constructor
    constructor() {
        System.out.println("Default Constructor Called");
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    constructor(String name, int age) {
        // this keyword current object ke variables ko refer karta hai
        this.name = name;
        this.age = age;
    }

    // Constructor Overloading (same name, different parameters)
    constructor(String name) {
        this.name = name;
        this.age = 18;
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        // Object 1 (Default Constructor call hoga)
        constructor obj1 = new constructor();
        obj1.display();

        // Object 2 (Parameterized Constructor call hoga)
        constructor obj2 = new constructor("Sunny", 19);
        obj2.display();

        // Object 3 (Overloaded Constructor call hoga)
        constructor obj3 = new constructor("Rahul");
        obj3.display();
    }
}

//  IMPORTANT CONCEPTS 

// Constructor vs Method:

// Constructor:
// - Same name as class
// - No return type
// - Automatically call hota hai

// Method:
// - Different name
// - Return type hota hai
// - Manually call hota hai

//  THIS KEYWORD

// this.variableName → current object ke variable ko refer karta hai

// Example:
// this.name = name;

//REAL USE 

// Constructor ka use hota hai:
// - Object creation ke time values set karne ke liye
// - Clean aur readable code ke liye
// - OOP concepts ke base ke liye

