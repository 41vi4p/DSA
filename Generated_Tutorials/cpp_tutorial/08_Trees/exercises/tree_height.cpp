#include <iostream>
#include <algorithm> // for std::max

struct Node {
    int data;
    Node* left;
    Node* right;
    Node(int val) : data(val), left(nullptr), right(nullptr) {}
};

// TODO: Implement a function to find the height (max depth) of a binary tree
// Height of empty tree is -1 or 0 (depending on definition, let's use 0 for null)
// Height of leaf node is 1
int getHeight(Node* root) {
    // 1. Base case: if root is null, return 0
    
    // 2. Recursive step:
    //    Get height of left subtree
    //    Get height of right subtree
    //    Return 1 + max(leftHeight, rightHeight)
    
    return 0; 
}

int main() {
    /* Constructed Tree:
            1
           / \
          2   3
         / \
        4   5
    */
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);

    std::cout << "Height of tree: " << getHeight(root) << std::endl; 
    // Expected: 3

    return 0;
}
