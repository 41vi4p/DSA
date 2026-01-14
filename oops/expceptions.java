//default throw default catched exceptions

// import java.util.*;

// public class expceptions {
//     int x[]=new int[7];
//     System.out.println(x[5]);
//     System.out.println(x[9]);// error: ArrayIndexOutOfBoundsException
//     int x=100000000000000000000000009;
//     System.out.println(x);// error: integer number too large
//     int a=10/0;
//     System.out.println(a);// error: ArithmeticException: / by zero
//     int no=Integer.parseInt("123");
//     System.out.println(no);
//     int no1=Integer.parseInt("hello");
//     System.out.println(no1);// error: NumberFormatException: For input string: "hello"
//     String s=null;
//     System.out.println(s);
//     System.out.println(s.length());// error: NullPointerException
    
// }

//default throw user defined catched exceptions
// import java.util.*;
// class expceptions {
//     public static void main(String[] args) {
//         int x=5,y=0,z;
//         try
//         {
//             System.out.println("hello 1");
//             z=x/y;
//             System.out.println(z);//will not execute
//             System.out.println("hello 2");//will not execute
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("cannot divide by zero");
//             System.out.println(e.getMessage());
//         }
//     }
// }


//our throw & default catch user defined exceptions

// import java.util.*;
// class expceptions 
// {
//     public static void main(String[] args) 
//     {
//         float per;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter percentage=");
//         per=sc.nextFloat();
//         try
//         {
//             if(per<0 || per>100)
//             {
//                 throw new ArithmeticException("invalid percentage");
//             }
//         }
//         catch (Exception e)
//         {   // default catch
//             System.out.println("Exception caught: " + e.getMessage());
//         }
//         sc.close();
//     }
// }

//out throw & our catch user defined exceptions

// import java.util.*;
// class expceptions {
//     public static void main(String[] args) {
//         float per;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter percentage=");
//         try
//         {
//             per=sc.nextFloat();
//             if(per<0 || per>100)
//             {
//                 throw new ArithmeticException("invalid percentage");
//             }
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("Caught Exception: "+ e.getMessage());
//         }
//         catch(IllegalArgumentException e)
//         {
//             System.out.println("Caught Exception: "+ e.getMessage());
//         }
//         catch(NullPointerException e)
//         {
//             System.out.println("Caught Exception: "+ e.getMessage());
//         }
//     }
// }


//finally block - when exception occurs, try block is terminated and control is transferred to catch block. After executing catch block, finally block is executed.
// import java.util.*;
// class expceptions {
//     public static void main(String[] args) {
//         int x=5,y=0,z;
//         try
//         {
//             System.out.println("hello 1");
//             z=x/y;
//             System.out.println(z);
//             System.out.println("hello 2");
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("cannot divide by zero");
//             System.out.println(e.getMessage());
//         }
//         // finally block will execute whether exception occurs or not, it will always execute
//         finally
//         {
//             System.out.println("This is finally block");
//         }
//     }
// }


//throws keyword - used to declare exception

import java.io.*;
import java.util.*;
class expceptions {
    public static void main(String[] args) throws ArithmeticException,IOException {
            FileWriter fw=new FileWriter("/home/kali/Documents/DSA/Manglam_DSA/oops/test.txt");
    }
}