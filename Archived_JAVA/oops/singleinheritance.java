// single inheritance

import java.util.*;
class parent
{
    void home()
    {
        System.out.println("From parent method..");
    }
    
}
class child extends parent
{

}
public class singleinheritance {
    public static void main(String[] args)
    {
        child obj= new child();
        obj.home();
    }
}
