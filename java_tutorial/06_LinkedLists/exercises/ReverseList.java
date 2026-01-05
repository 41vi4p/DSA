class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class ReverseList {

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    // TODO: Reverse the linked list
    static Node reverse(Node head) {
        /*
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            // Logic here
        }
        return prev;
        */
        return null; // Replace
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Original: ");
        printList(head);

        // head = reverse(head);

        System.out.print("Reversed: ");
        printList(head);
    }
}
