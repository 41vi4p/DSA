//netested Interface
interface I1
{
    void fun1();
    interface I2
    {
        int y=20;
        void fun2();
    }
}
class nestedinterface implements I1,I1.I2
{
    public void fun1()
    {
        System.out.println("hello");             
    }
    public void fun2()
    {
        System.out.println("hii");
                
    }
    public static void main(String[] args) {
 
//        Ex e1=new Ex();
//        e1.fun2();
//        e1.fun1();
      
        I1 e1=new nestedinterface();
        e1.fun1();
        e1.fun2();// error
                
    
    }
           
}