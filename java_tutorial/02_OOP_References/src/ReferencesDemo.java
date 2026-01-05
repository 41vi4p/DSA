class Box {
    int data;
    Box(int data) { this.data = data; }
}

public class ReferencesDemo {
    public static void main(String[] args) {
        // 1. Primitives (Value Copy)
        int x = 10;
        int y = x;
        y = 20;
        System.out.println("Primitives:");
        System.out.println("x: " + x + " (Unchanged)");
        System.out.println("y: " + y);

        // 2. References (Address Copy)
        Box a = new Box(10);
        Box b = a; // b points to the SAME object as a
        b.data = 20;

        System.out.println("\nReferences:");
        System.out.println("a.data: " + a.data + " (CHANGED!)");
        System.out.println("b.data: " + b.data);
        
        System.out.println("\nLesson: Objects are shared when assigned!");
    }
}
