import java.util.*;
public class arrayavg
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
            sum +=arr[i];
        }
        System.out.println("Average of all element in the array= "+ sum/n);
    }
}