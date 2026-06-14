package strings;
import java.util.Scanner;

public class str_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversed = "";
        for(int i=input.length(); i>0; i--){
            reversed += input.charAt(i-1);
        }
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
