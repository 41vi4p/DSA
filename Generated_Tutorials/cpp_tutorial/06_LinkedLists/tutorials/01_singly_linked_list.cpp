#include <iostream>
#include "../../utils/visualizer.h"

struct Node {
    int data;
    Node* next;

    Node(int val) : data(val), next(nullptr) {}
};

// Visualization Helper
void drawList(Node* head, Node* current = nullptr) {
    Node* temp = head;
    std::cout << "HEAD -> ";
    while (temp != nullptr) {
        if (temp == current) {
             std::cout << "[" << temp->data << "] -> "; // Highlight
        } else {
             std::cout << temp->data << " -> ";
        }
        temp = temp->next;
    }
    std::cout << "NULL" << std::endl;
}

int main() {
    std::cout << "Building a Linked List..." << std::endl;
    
    // Creating Nodes
    Node* head = new Node(10);
    Visualizer::clearScreen();
    std::cout << "Adding 10...\n\n";
    drawList(head);
    Visualizer::sleep(1000);

    head->next = new Node(20);
    Visualizer::clearScreen();
    std::cout << "Linking 20...\n\n";
    drawList(head);
    Visualizer::sleep(1000);

    head->next->next = new Node(30);
    Visualizer::clearScreen();
    std::cout << "Linking 30...\n\n";
    drawList(head);
    Visualizer::sleep(1000);

    // Traversal
    Visualizer::clearScreen();
    std::cout << "Traversing the list...\n\n";
    Node* temp = head;
    while (temp != nullptr) {
        Visualizer::clearScreen();
        std::cout << "Traversing...\n\n";
        drawList(head, temp); // Pass temp to highlight current node
        std::cout << "\nVisiting Node with data: " << temp->data << "\n";
        Visualizer::sleep(800);
        temp = temp->next;
    }

    std::cout << "\nTraversal Complete!" << std::endl;

    return 0;
}
