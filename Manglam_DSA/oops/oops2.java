import java.util.*;

public class oops2{
    int a;
    void acp(int a)
    {
        this.a=a;
    }
    void dis()
    {
        System.out.println("A is "+a);
    }
    public static void main(String[] args) {
        oops2 e1=new oops2();
        e1.acp(10);
        e1.dis();
    }
}
