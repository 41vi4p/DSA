#include <iostream>

struct Node {
    int data;
    Node* next;
    Node(int val) : data(val), next(nullptr) {}
};

// Functions to help setup
void printList(Node* head) {
    while (head) {
        std::cout << head->data << " -> ";
        head = head->next;
    }
    std::cout << "NULL\n";
}

// TODO: Implement this function to reverse the linked list
// Input: 1 -> 2 -> 3 -> NULL
// Output: 3 -> 2 -> 1 -> NULL
Node* reverseList(Node* head) {
    // Node* prev = nullptr;
    // Node* current = head;
    // Node* next = nullptr;

    // while (current != nullptr) {
        // 1. Save next node
        // 2. Reverse pointer
        // 3. Move prev and current forward
    // }

    return nullptr; // Return new head
}

int main() {
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);

    std::cout << "Original List: ";
    printList(head);

    // TODO: Uncomment
    // head = reverseList(head);

    std::cout << "Reversed List: ";
    printList(head);

    return 0;
}
