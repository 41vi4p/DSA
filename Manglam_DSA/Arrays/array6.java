import java.util.*;
public class array6
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
            if(arr[i]>maxsofar)
            {
                maxsofar=arr[i];
            }
        }
        System.out.println("Minimum element in the array="+maxsofar);
    }
}