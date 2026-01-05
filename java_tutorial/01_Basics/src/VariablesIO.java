import java.util.Scanner;

public class VariablesIO {
    public static void main(String[] args) {
        // 1. Output
        System.out.println("Welcome to Java Basics!");

        // 2. Variables
        int age = 20;
        double height = 5.9;
        boolean isLearning = true;
        String name = "User";

        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        
        // 3. Input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your favorite number: ");
        if (scanner.hasNextInt()) {
            int favNum = scanner.nextInt();
            System.out.println("You entered: " + favNum);
        } else {
            System.out.println("That wasn't a number!");
        }
        
        scanner.close();
    }
}
