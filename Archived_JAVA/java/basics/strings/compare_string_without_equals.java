package strings;
import java.util.Scanner;

public class compare_string_without_equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string2: ");
        String str2 = sc.nextLine();
        boolean areEqual = true;
        if(str1.length() != str2.length()){
            areEqual = false;
        } else{
            for(int i=0;i<str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    areEqual = false;
                    break;
                }
            }
        }
        if(areEqual){
            System.out.println("equal");
            
        } else {
            System.out.println("not equal");
        }
        sc.close();
    }
}