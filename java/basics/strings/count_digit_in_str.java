package strings;
import java.util.Scanner;

public class count_digit_in_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitCount++;
            }
        }

        System.out.println("Number of digits in the string: " + digitCount);
    }
}
