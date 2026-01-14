package strings;
import java.util.Scanner;

public class print_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String lastChar =  String.valueOf(input.charAt(input.length()-1));
        
        System.out.println("Last: " + lastChar);
        sc.close();
    }
}
