class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; }
}

public class TreeHeight {

    // TODO: Calculate the height of the tree (max depth)
    // Height of empty tree = 0
    // Height of leaf = 1
    public static int getHeight(Node root) {
        // Base case
        
        // Recursive step
        // 1 + max(leftHeight, rightHeight)
        
        return 0; // Replace
    }

    public static void main(String[] args) {
        /*
            1
           / \
          2   3
         / \
        4   5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Height: " + getHeight(root));
        // Expected: 3
    }
}
