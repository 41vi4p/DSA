class test2{
    public static void main(String[] args) {
        test3 t=new test3();
        t.fun1(78);
        t.fun1();
    }
}

class test {
    void fun1()
    {
        System.out.println("hii");
    }
}
class test3 extends test
{
    void fun1(int a)
    {
        System.out.println("hello...");
    }
}

