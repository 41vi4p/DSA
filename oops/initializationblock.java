class instance
{
    {
        System.out.println("Instance Initialization Block");
    }
    static
    {
        System.out.println("Static Initialization Block");
    }
}
public class initializationblock {
    public static void main(String[] args) {
        instance obj1 = new instance();
        instance obj2 = new instance();
    }
}
