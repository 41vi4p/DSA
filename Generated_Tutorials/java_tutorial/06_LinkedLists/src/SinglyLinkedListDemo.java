class Node {
    int data;
    Node next;
    
    Node(int data) { this.data = data; }
}

public class SinglyLinkedListDemo {

    public static void printList(Node head, Node highlightNode) {
        Node temp = head;
        System.out.print("HEAD -> ");
        while (temp != null) {
            if (temp == highlightNode) {
                System.out.print("[" + temp.data + "] -> ");
            } else {
                System.out.print(temp.data + " -> ");
            }
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Building Linked List...");
        Thread.sleep(1000);

        // 1. Create Nodes
        Node head = new Node(10);
        printList(head, head);
        Thread.sleep(800);

        head.next = new Node(20);
        printList(head, head.next);
        Thread.sleep(800);

        head.next.next = new Node(30);
        printList(head, head.next.next);
        Thread.sleep(800);

        // 2. Traversal
        System.out.println("\nTraversing...");
        Node current = head;
        while (current != null) {
            // Visualize current node
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.println("Current Value: " + current.data);
            printList(head, current);
            
            Thread.sleep(800);
            current = current.next;
        }
        System.out.println("\nDone!");
    }
}
