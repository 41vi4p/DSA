package strings;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean is = false;
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                is = true;
            } else {
                is = false;
                break;
            }
        }

        if (is) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        sc.close();
    }
}
