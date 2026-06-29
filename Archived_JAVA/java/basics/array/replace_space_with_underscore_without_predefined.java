package array;
import java.util.Scanner;

class replace_space_with_underscore_without_predefined {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == ' ') {
                result += '_';
            } else {
                result += currentChar;
            }
        }
        System.out.println(result);
        sc.close();

    }
}