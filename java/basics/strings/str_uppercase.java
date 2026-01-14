package strings;
import java.util.Scanner;

public class str_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String uppercased = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercased);
        sc.close();
    }
}
