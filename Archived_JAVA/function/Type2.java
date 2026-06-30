import java.util.*;

public class Type2 {

    // function implementation
    public static int msg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        sc.close();
        return x % 10;
    }

    public static void main(String args[]) {
        int ans = msg(); // function calling
        if (ans % 2 == 0) {
            System.out.println("Last digit is even");
        } 
        else {
            System.out.println("Last digit is odd");
        }
    }
}
