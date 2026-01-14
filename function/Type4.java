import java.util.*;
public class Type4 {

    public static void even(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println("Sum of even no. from 1 to 50= "+ sum);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the last no. till which you want the even sum= ");
        int n= sc.nextInt();
        even(n);
        sc.close();
    }
    
}
