class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; }
}

public class BSTVisualized {
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    // Prints tree structure purely for visualization
    public static void printTree(Node root, int space) {
        if (root == null) return;
        space += 5;
        printTree(root.right, space);
        System.out.println();
        for (int i = 5; i < space; i++) System.out.print(" ");
        System.out.println(root.data);
        printTree(root.left, space);
    }

    // Recursive Insert
    public static Node insert(Node root, int val) throws InterruptedException {
        clearScreen();
        System.out.println("Inserting " + val + "...");
        
        if (root == null) {
            System.out.println("-> Placed at valid spot!");
            Thread.sleep(800);
            return new Node(val);
        }

        System.out.println("Comparing with " + root.data);
        Thread.sleep(500);

        if (val < root.data) {
            System.out.println("-> Going Left");
            root.left = insert(root.left, val);
        } else {
            System.out.println("-> Going Right");
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) throws InterruptedException {
        Node root = null;
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int v : values) {
            root = insert(root, v);
            
            clearScreen();
            System.out.println("Current Tree:");
            System.out.println("----------------");
            printTree(root, 0);
            System.out.println("----------------");
            Thread.sleep(1500);
        }
    }
}
