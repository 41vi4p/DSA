# Module 07: Stacks & Queues

## Overview
Stacks (LIFO) and Queues (FIFO) are used everywhere.

## Key Concepts

### 1. The `Deque` Interface
In Modern Java, we prefer `Deque` (Double Ended Queue) over the legacy `Stack` class.
- **Stack**: `ArrayDeque` (push/pop).
- **Queue**: `ArrayDeque` or `LinkedList` (offer/poll).

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);
stack.pop();
```

## Your Mission
1.  Run `src/StackQueueDemo.java`.
2.  Complete `exercises/ValidParentheses.java`.
