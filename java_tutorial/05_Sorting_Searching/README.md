# Module 05: Sorting & Searching

## Overview
Sorting is arguably the most common algorithmic task. Java provides powerful built-in tools for this.

## Key Concepts

### 1. Built-in Sorting
- `Arrays.sort(arr)`: Sorts arrays of primitives or objects.
- `Collections.sort(list)`: Sorts ArrayLists and Lists.
- Uses **Dual-Pivot Quicksort** (primitives) or **TimSort** (objects).

### 2. Comparable vs Comparator
How does Java know *how* to sort custom objects (like `Student`)?
- **Comparable (`compareTo`)**: "Natural" ordering defined inside the class.
- **Comparator (`compare`)**: Custom ordering defined separately (e.g., sort by name vs sort by grade).

### 3. Binary Search
- `Arrays.binarySearch(arr, key)`: Fast O(log n) search on **sorted** arrays.

## Your Mission
1.  Run `src/SortingDemo.java` to see built-in sorts and binary search.
2.  Run `src/BubbleSortVisualized.java` for an animation.
3.  Complete `exercises/StudentSort.java`.
