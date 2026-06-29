#include<iostream>

using namespace std;

struct Node
{
    int val;
    Node* next;
    Node(int v):val(v), next(nullptr){}
};

//Reverse a linked list (iterative)
Node* reverse(Node* head){
    Node* prev= nullptr, *curr=head;
    while(curr){
        Node* nxt = curr->next;
        curr->next=prev;
        prev=curr; curr=nxt;
    }
    return prev;
}

//Detect cycle - Floyd's tortoise & hare
bool hasCycle(Node* head){
    Node* slow=head, *fast=head;
    while(fast && fast->next){
        slow = slow->next;
        fast = fast->next->next;
        if(slow == fast) return true;
    }
    return false;
}

//Find middle node
Node* findMid(Node* head){
    Node* slow=head, *fast=head;
    while(fast->next && fast->next->next){
        slow= slow->next;
        fast = fast->next->next;
    }
    return slow; //slow is the middle
}

// print list
void printlist(Node* head)
{
    while(head){
        cout<<head->val<<"->";
        head = head->next;
    }
    cout<<"NULL\n";
}

int main(){
    //create a sample linked list: 1 -> 2 -> 3 ->4 -> 5
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);
    head->next->next->next->next = new Node(5);

    cout<<"Original List: \n";
    printlist(head);

    //reverse
    head = reverse(head);
    cout<<"Reversed List: \n";
    printlist(head);

    //detect cycle
    cout<<"Cycle present? "<<(hasCycle(head)? "yes":"no")<<endl;

    //find middle
    head->next->next->next->next= nullptr;
    printlist(head);
    Node* mid=findMid(head);
    cout<<"\nMiddle: "<<mid->val<<endl;

    return 0;
}