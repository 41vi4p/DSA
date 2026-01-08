import java.util.*;
class parent
{
    void home()
    {
        System.out.println("From parent method..");
    }
    
}
class child1 extends parent
{
    void car1()
    {
        System.out.println("From child 1 BMW");
    }
}
class child2 extends parent
{
    void car1()
    {
        System.out.println("fROM CHILD 2 AUDI");
    }
}

public class Herarchicalinheritance {
     public static void main(String[] args)
    {
        child1 c1= new child1();
        child2 c2= new child2();
        c1.home();
        c2.home();
        c1.car1();
        c2.car1();
    }
}
