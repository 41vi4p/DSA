package strings;
import java.util.Scanner;

public class str_len {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        System.out.println("Length of the string: " + length);
        sc.close();
    }

    
}
