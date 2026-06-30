import java.util.*;
public class array7
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
        System.out.print("Enter element to find= ");
        int f= sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(arr[j]==f)
            {
                System.out.println("Element found at index "+j+" with value = "+ arr[j]);
            }
        }
    }
}