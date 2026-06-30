import java.util.*;
public class Rrotatek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Element"+ i + "= ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter by how much to rotate(k)= ");
        int k=sc.nextInt();
        for(int j=0;j<k;j++)
        {
            for(int i=n-1;i>0;i--)
            {
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Element at index"+ i + "= "+ arr[i]);
        }
    }
}
// 1,2,3,4,5
// 5,1,2,3,4
// 5,4,1,2,3