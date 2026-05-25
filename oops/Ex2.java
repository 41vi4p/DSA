//method overiding - same name methoods with same parameters (child class overides the method of parent class)
import java.util.*;
class parent
{
    void car()
    {
        System.out.println("Maruti");
    }
}
class child extends parent
{
    void car()
    {
        System.out.println("bmw");
    }
}
public class Ex2 {
    public static void main(String[] args) {
        child c1=new child();
        c1.car();
    }
}
