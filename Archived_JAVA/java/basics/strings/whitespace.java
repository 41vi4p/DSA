package strings;
import java.util.Scanner;

public class whitespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch=' ';
        sc.close();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                System.out.println(str.replace(" ", ""));
                break;
            }
        }
    }
}
