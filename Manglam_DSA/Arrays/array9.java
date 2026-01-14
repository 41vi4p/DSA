import java.util.*;
public class array9
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array= ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int maxsofar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Element "+ i + "= ");
            arr[i]=sc.nextInt();
        }
        int copy[]=new int[n];
        for(int j=0;j<n;j++)
        {
            copy[j]=arr[j];
        }
        for(int k=0;k<n;k++)
        {
            System.out.println("Copy Element "+k+ " = "+ copy[k]);
        }
    }
}