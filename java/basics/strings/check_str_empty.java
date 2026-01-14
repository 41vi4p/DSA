package strings;
import java.util.Scanner;

public class check_str_empty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
        sc.close();
    }
}
