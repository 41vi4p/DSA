

import java.util.Scanner;

//take elements from user and calculate the addition element between an array
/* Sample Test Case : arr = [1, 2, 4, 9, 10]
Expected Output  : 26

Constraints :
-----------------------
  0 <= arr.length <= 10^4
  -10^4 <= arr[n] <= 10^4

Note :
-------------------
  TC : O(N), try to solve in average case
 */




class InputBalanceException extends Exception{
    InputBalanceException(String message){
        super(message);
    }
}

public class banking {
   
    public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        try{
            if(sc.nextInt()>=1000)
                throw new InputBalanceException("Insufficient Balance");
        }
        catch(InputBalanceException e){
            System.out.println(e.getMessage());
        }
    
        
        
    }
    
}



