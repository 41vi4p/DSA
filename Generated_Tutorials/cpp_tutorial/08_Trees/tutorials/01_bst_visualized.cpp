#include <iostream>
#include <string>
#include "../../utils/visualizer.h"

struct Node {
    int data;
    Node* left;
    Node* right;
    Node(int val) : data(val), left(nullptr), right(nullptr) {}
};

// Insert into BST with Visualization
Node* insert(Node* root, int val, std::string path = "Root") {
    Visualizer::clearScreen();
    std::cout << "Inserting " << val << " at " << path << "...\n";
    
    if (root == nullptr) {
        std::cout << "-> Found empty spot! Placing " << val << " here.\n";
        Visualizer::sleep(500);
        return new Node(val);
    }

    std::cout << "-> Current Node: " << root->data << "\n";
    Visualizer::sleep(500);

    if (val < root->data) {
        std::cout << "-> " << val << " < " << root->data << ", going LEFT.\n";
        Visualizer::sleep(500);
        root->left = insert(root->left, val, path + "->Left");
    } else {
        std::cout << "-> " << val << " > " << root->data << ", going RIGHT.\n";
        Visualizer::sleep(500);
        root->right = insert(root->right, val, path + "->Right");
    }

    return root;
}

// Pretty Print Tree (Reverse In-order)
// Rotates the tree 90 degrees counter-clockwise for printing
void printTree(Node* root, int space = 0) {
    if (root == nullptr) return;
    int COUNT = 5;
    space += COUNT;

    printTree(root->right, space);

    std::cout << std::endl;
    for (int i = COUNT; i < space; i++) std::cout << " ";
    std::cout << root->data << "\n";

    printTree(root->left, space);
}

int main() {
    Node* root = nullptr;
    std::vector<int> values = {50, 30, 20, 40, 70, 60, 80};

    for (int v : values) {
        root = insert(root, v);
        
        Visualizer::clearScreen();
        std::cout << "Current Tree Structure:\n";
        Visualizer::printLine();
        printTree(root);
        Visualizer::printLine();
        Visualizer::sleep(1000);
    }

    return 0;
}
