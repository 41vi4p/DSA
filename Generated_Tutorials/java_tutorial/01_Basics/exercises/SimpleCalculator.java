import java.util.Scanner;

public class SimpleCalculator {
    
    // TODO: Create a static method 'add' that returns the sum of two doubles
    // public static double add(double a, double b) { ... }

    // TODO: Create 'subtract', 'multiply', and 'divide' methods

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        // TODO: Use switch statement to call appropriate methods
        /*
        switch(op) {
            case '+': result = add(num1, num2); break;
            ...
        }
        */

        System.out.println("Result: " + result);
        scanner.close();
    }
}
