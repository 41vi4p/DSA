import java.util.*;

public class rec {
    public static void printArray(int[] arr, int size) {
        

        //base case
        if(arr.length==size)
            return;

        printArray(arr, size+1);
        System.out.println(arr[size]);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++)
            arr[i]= sc.nextInt();
        System.out.println("Printing...");
        printArray(arr, 0);
    }
}
