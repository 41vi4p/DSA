import java.util.*;
public class Type3 {

    public static int armstrong(int n)
    {
        int one= n/100;
        int two= (n%100)/10;
        int three= n%10;
        int sum= (int)(Math.pow(one,3) + Math.pow(two,3) + Math.pow(three,3));
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter armstrong no. = ");
        int n= sc.nextInt();
        int result=armstrong(n);
        if(result==n)
        {
            System.out.println("No. is armstrong");
        }
        else
        {
            System.out.println("No. is not armstrong");
        }
        sc.close();
    }
    
}