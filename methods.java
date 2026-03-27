public class methods {

    // Method without return type (void)
    // Ye sirf kaam karega, kuch return nahi karega
    public static void greet() {
        System.out.println("Hello Sunny");
    }

    // Method with parameters
    // Ye 2 numbers lega aur unka sum print karega
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Method with return type
    // Ye 2 numbers ka multiplication karke result return karega
    public static int multiply(int a, int b) {
        int result = a * b;
        return result; // value wapas bhejna
    }

    // Method with return + parameter
    // Ye kisi number ka square return karega
    public static int square(int n) {
        return n * n;
    }

    // Method to check even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    // Method with String parameter
    // Ye name lekar greeting print karega
    public static void greetUser(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        // Method call without parameters
        greet();

        // Method call with parameters
        add(5, 3);

        // Method call with return value
        int mulResult = multiply(4, 6);
        System.out.println("Multiplication: " + mulResult);

        // Square method
        int sq = square(5);
        System.out.println("Square: " + sq);

        // Even Odd check
        checkEvenOdd(7);

        // Greeting user
        greetUser("Sunny");
    }
}