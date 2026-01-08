import java.util.*;
public class array3
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array= ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Element"+ i + "= ");
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                System.out.println("Even element at index "+i+" with value"+arr[i]);
            }
        }
    }
}