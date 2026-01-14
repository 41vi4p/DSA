package array;
import java.util.Scanner;

public class find_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
    }
        System.out.println("Enter element to find:");
        int target = sc.nextInt();
        sc.close();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("found at index: " + index);
        } else {
            System.out.println("not found in the array.");
        }
    }
}
