# Module 09: Heaps & Priority Queues

## Overview
A framework for finding the "most important" item instantly.

## Key Concepts

### 1. PriorityQueue
Java implements heaps via `PriorityQueue`.
- Default: **Min-Heap** (Smallest item at top).
- Custom: Pass a `Comparator` for Max-Heap.

```java
// Min Heap
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Max Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
```

## Your Mission
1.  Run `src/HeapDemo.java`.
2.  Complete `exercises/KthLargest.java`.
