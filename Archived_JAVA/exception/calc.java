
//take elements from user and calculate the addition element between an array
/* Sample Test Case : arr = [1, 2, 4, 9, 10]
Expected Output  : 26

Constraints :
-----------------------
  0 <= arr.length <= 10^4
  -10^4 <= arr[n] <= 10^4

Note :
-------------------
  TC : O(N), try to solve in average case
 */

import java.util.Scanner;

public class calc {
    public static int findSum(int length, int[] arr){
        int start=0;
        int end= arr.length-1;
        int sum =0;
        for(int i=0;i<arr.length;i++)
            sum=sum+ arr[i];
        // System.out.println(sum);
        return sum;

    }
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int length = sc.nextInt();
     
        
        System.out.println("Enter the array elements:");
        int[] arr = new int[length];
        for(int i=0; i<length;i++)
            arr[i]=sc.nextInt();
        sc.close();
        System.out.println(findSum(length, arr));
        
    }
    
}
