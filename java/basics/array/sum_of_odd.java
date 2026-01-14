package array;
import java.util.Scanner;

public class sum_of_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of odd array elements: " + sum);
        sc.close();
    }
}
