# Module 10: Heaps & Priority Queues

## Overview
A **Heap** is a special tree-based structure that satisfies the *heap property*.
It's the most efficient way to repeatedly find the minimum or maximum element.

## Key Concepts

### 1. Max-Heap vs Min-Heap
- **Max-Heap**: Parent is always >= Children. Root is the maximum.
- **Min-Heap**: Parent is always <= Children. Root is the minimum.

### 2. Priority Queue
Abstract data type often implemented using a Heap. Elements are served based on "priority" rather than just insertion order.
- `std::priority_queue`: By default, it's a Max-Heap in C++.

### 3. Usage
- Scheduling tasks (highest priority first).
- Dijkstra's pathfinding algorithm.
- Finding the "K-th" largest/smallest element.

## Your Mission
1.  Run `tutorials/01_heap_visualized.cpp` to see elements bubbling up!
2.  Complete `exercises/kth_largest.cpp`.
