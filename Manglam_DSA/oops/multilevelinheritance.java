import java.util.*;
class grandparent
{
    void home()
    {
        System.out.println("From grandparent method..");
    }
    
}
class parent extends grandparent
{
    void car()
    {
        System.out.println("From parent method..");
    }
    
}
class child extends parent
{

}

public class multilevelinheritance {
     public static void main(String[] args)
    {
        child obj= new child();
        obj.car();
        obj.home();
    }
}
