import java.util.Random;
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
        Random random = new Random();
        int randomNum = random.nextInt(10) + 1; // Random number between
        
        System.out.print("Enter your favorite number: ");
        if (scanner.hasNextInt()) {
            if(scanner.nextInt() == randomNum) {
            
            int favNum = scanner.nextInt();
            System.out.println("You entered the correct guess: " + favNum);
            }
            else {
                System.out.println("Bad Luck, didn't match");
                System.out.println("The correct number was: " + randomNum);
            }
        } else {
            System.out.println("That wasn't a number!");
        }
        
        scanner.close();
    }
}
