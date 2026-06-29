import java.util.*;
public class array5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array= ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int minsofar=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Element "+ i + "= ");
            arr[i]=sc.nextInt();
            if(arr[i]<minsofar)
            {
                minsofar=arr[i];
            }
        }
        System.out.println("Minimum element in the array="+minsofar);
    }
}