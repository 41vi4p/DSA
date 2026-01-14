import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        sc.close();
        String result = getArmstrong(n);
        System.out.println(result);
    }

    static String getArmstrong(int n){
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        if (sum == original) {
            return original + " is an Armstrong number.";
        } else {
            return original + " is not an Armstrong number.";
        }
        
    }
}
