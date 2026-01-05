# Module 06: Linked Lists

## Overview
A chain of nodes. Unlike Java's built-in `LinkedList`, we will build one from scratch to understand the internals.

## Key Concepts

### 1. The Node Class
```java
class Node {
    int data;
    Node next;
}
```

### 2. Pointers vs References
In C++, `next` is a pointer. In Java, `next` is a Reference.
- `head = head.next`: Moves the reference forward.
- `null`: The end of the list.

## Your Mission
1.  Run `src/SinglyLinkedListDemo.java` to visualize the chain.
2.  Complete `exercises/ReverseList.java`.
