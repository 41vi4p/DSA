package strings;
import java.util.Scanner;

public class words_in_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        System.out.println("words: " + words.length);
        sc.close();
    }
}
