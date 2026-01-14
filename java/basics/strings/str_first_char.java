package strings;
import java.util.Scanner;

public class str_first_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char firstChar = input.charAt(0);
        System.out.println("First character: " + firstChar);
        sc.close();
    }
}
