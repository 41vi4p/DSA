import java.util.*;
public class array1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array= ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Element"+ i + "= ");
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            System.out.println("Element"+j+"= "+ arr[j]);
        }
    }
}