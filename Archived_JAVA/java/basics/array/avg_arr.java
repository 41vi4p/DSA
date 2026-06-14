//package array;

import java.util.Scanner;

public class avg_arr {
    public static void main(String[] args) {
        int[] arr;
        arr =arr_input();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println((double)sum/(arr.length));
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
}
    static int[] arr_input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr= new int[n];

        System.out.print("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
}
