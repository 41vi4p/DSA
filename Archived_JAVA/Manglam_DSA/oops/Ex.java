//method overloading- same name methods with different parameters
import java.util.*;
class Test
{
    void fun1()
    {
        System.out.println("from test fun1");
    }
}

class Test2 extends Test
{
    void fun1()
    {
        System.out.println("from test2 fun1 without param");
    }
    void fun1(int a)
    {
        // super.fun1();
        this.fun1();
        System.out.println("from Ex fun 1");
    }
}
public class Ex {
    public static void main(String[] args) 
    {
        Test2 t1= new Test2();
        t1.fun1(10);
    }
}
