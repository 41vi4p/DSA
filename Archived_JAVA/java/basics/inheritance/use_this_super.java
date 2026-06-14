
public class use_this_super {
    static class Ex {
        int a;
        int b;

        Ex(int a, int b) {
            this.a = a;
            this.b = b;
        }


    }
    static class Ex2 extends Ex{
        Ex2(){
            super(0, 0); // Call super with default values
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        Ex2 e1 = new Ex2();
    }
}
