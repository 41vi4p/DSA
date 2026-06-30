import java.util.*;
public class array8
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
        int f=0;
        int b=n-1;
        int m=n/2;
        for(int j=m;j>=0;j--)
        {
            int temp=arr[f];
            arr[f]=arr[b];
            arr[b]=temp;
            f++;
            b--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Element "+ i + " = "+arr[i]);
        }
    }
}