# Module 08: Trees & Binary Search Trees (BST)

## Overview
Trees are hierarchical data structures. Unlike arrays or linked lists, which are linear, trees branch out.

## Key Concepts

### 1. Structure
- **Root**: The top node.
- **Child**: A node directly connected to another node when moving away from the Root.
- **Leaf**: A node with no children.

### 2. Binary Tree
Each node has at most 2 children: `left` and `right`.
```cpp
struct Node {
    int data;
    Node* left;
    Node* right;
};
```

### 3. Binary Search Tree (BST)
A special Binary Tree where:
- Left child < Parent
- Right child > Parent
This property makes searching very fast (O(log n)).

## Your Mission
1.  Run `tutorials/01_bst_visualized.cpp`. It prints the tree structure nicely!
2.  Complete `exercises/tree_height.cpp`.
