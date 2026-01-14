# Module 06: Linked Lists

## Overview
A Linked List is a chain of "nodes". Unlike arrays, nodes can be scattered anywhere in memory. Each node points to the next one.

## Key Concepts

### 1. The Node
A simple structure containing data and a pointer.
```cpp
struct Node {
    int data;
    Node* next;
};
```

### 2. Singly vs Doubly Linked Lists
- **Singly**: `next` pointer only. Can only go forward.
- **Doubly**: `next` and `prev` pointers. Can go both ways.

### 3. Basic Operations
- **Traversal**: Go from Head to Tail (O(n)).
- **Insertion**: Change pointers (O(1) if you have the pointer).
- **Deletion**: Change pointers to skip a node.

## Your Mission
1.  Run `tutorials/01_singly_linked_list.cpp` to see how nodes link together visually.
2.  Complete `exercises/reverse_list.cpp` to separate the pros from the amateurs!
