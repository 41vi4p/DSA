package strings;
import java.util.Scanner;

public class compare_string_using_equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string2: ");
        String str2 = sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
        sc.close();
    }
}
