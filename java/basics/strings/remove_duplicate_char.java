package strings;
import java.util.Scanner;

class remove_duplicate_char {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(input.indexOf(ch)==i){
                System.out.print(ch);
            }
        }
        
    }
}