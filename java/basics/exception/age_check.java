import java.util.*;

class AgeCheck extends Exception{
        AgeCheck(String message){
            super(message);
        }
    }

public class age_check {
    
    public static void main(String[] args) {
        System.out.println("Enter the Age: ");
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        try{
            if(age<18)
                throw new AgeCheck("Can't Vote");
            System.out.println("You can Vote");
        }
        catch(AgeCheck e)
        {
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}
