interface A
{
    int x=10;
    static int y=20;
    public static final int z=30;
    void show();
}
interface B
{
    void show();
}

class Interface1 implements A,B
{
    public void show()
    {
        System.out.println("Hello");
    }
    public int show(int a)
    {
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
        Interface1 obj=new Interface1();
        obj.show(1000);
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(A.x);
        System.out.println(A.y);
        System.out.println(A.z);
//        obj.x=20;// error you cant chnage
                
    }
}