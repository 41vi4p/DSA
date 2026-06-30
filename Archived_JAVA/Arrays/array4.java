import java.util.*;
public class array4
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array= ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Element "+ i + "= ");
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                sum+=arr[i];
            }
        }
        System.out.println("sum of all odd numbers in the array="+sum);
    }
}