package strings;
import java.util.Scanner;

public class count_space {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int spaceCount=0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==' '){
                spaceCount++;
            }
        }
        System.out.println("Spaces: "+spaceCount);
    }
}
