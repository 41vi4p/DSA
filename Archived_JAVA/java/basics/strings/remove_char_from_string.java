package strings;
import java.util.Scanner;

public class remove_char_from_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();
        System.out.println("Enter character to remove:");
        char charToRemove = sc.nextLine().charAt(0);
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != charToRemove) {
                result += currentChar;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
