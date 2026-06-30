//Addition using recurssion

import java.util.*;

public class add_rec {
    public static void findSum(int[] arr, int size){
        int sum =0;
        //base case
        if(arr.length==size)
            return;
        findSum(arr,size+1);

        sum=sum+arr[size];
        
        System.out.println(sum);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size: ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("ENter the array elements: ");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Adding");
        findSum(arr, 0);
        

    }
}
