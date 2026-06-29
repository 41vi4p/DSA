
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {

    Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void displayLinkedList(){
        Node tempVar = head;

        while (tempVar != null){
            System.out.println(tempVar.data);
            tempVar = tempVar.next;
        }
    }

    public void insertElementAtEnd(int data){

        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node tempVar = head;
        while (tempVar.next != null){
            tempVar = tempVar.next;
        }

        tempVar.next = newNode;
    }

    public void reverseLinked_list(){
        Node prev = null;
        Node currNode=head;
        Node next =null;

        while(current!=null){
            next= current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head=prev;
        
    }

    public static void main(String[] args){
        Main obj = new Main();
        obj.insertAtHead(10);
        obj.insertAtHead(20);
        obj.displayLinkedList();
        obj.insertElementAtEnd(30);
        obj.displayLinkedList();
        obj.reverseLinked_list();
        obj.displayLinkedList();

    }

}