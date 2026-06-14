

import java.util.Scanner;

public class left_rotate_by_k {
    public static void main(String[] args) {
        int[] arr;
        arr =arr_input();
        System.out.println("Enter number of positions to rotate:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        arr = leftRotateByOne(arr, k);
        printArray(arr);
    }

    static int[] leftRotateByOne(int[] arr, int k){
        for(int i=0;i<k;i++){
            int first = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        return arr;
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
        // sc.close();
        return arr;
    }
}
