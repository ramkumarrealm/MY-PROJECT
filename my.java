public class HelloWorld {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Print to console
        System.out.println("Hello, World!");
        
        // Variables
        int number = 10;
        double decimal = 3.14;
        boolean isJavaFun = true;
        String message = "Welcome to Java Programming!";
        
        // Conditional statement
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is less than or equal to 5");
        }
        
        // Loop example
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // Array example
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("\nFruit list:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        // Call a method
        int sum = addNumbers(5, 7);
        System.out.println("\nSum of 5 and 7 is: " + sum);
    }
    
    // Method example
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
