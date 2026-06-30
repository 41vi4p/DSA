

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        try{
            System.out.print(n1/n2);
        }
        catch(Exception e)
        {
            System.out.print("Invalid Input");
        }
        System.out.print("Hello");
    }
}
