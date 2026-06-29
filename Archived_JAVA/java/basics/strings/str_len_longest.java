
import java.util.Scanner;

public class str_len_longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        int length = input.length();
        
        String[] words = input.split(" ");
        String longest_word="";
        for(String word:words){
            if(word.length()>longest_word.length())
                longest_word=word;
        }
    
        System.out.println("Length of the string: " + length);
        System.out.println("Longest word: "+ longest_word);
    }

    
}
