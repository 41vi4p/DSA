# Module 03: Arrays & Vectors

## Overview
How do we store lists of items? In C++, we have two main ways: basic **Arrays** and the powerful **Vectors**.

## Key Concepts

### 1. Static Arrays
- Fixed size.
- Fast, but inflexible.
```cpp
int arr[5] = {1, 2, 3, 4, 5};
```

### 2. std::vector
- Dynamic size (can grow/shrink).
- Part of the Standard Template Library (STL).
- Much safer and more versatile than raw arrays.
```cpp
#include <vector>
std::vector<int> numbers = {1, 2, 3};
numbers.push_back(4); // Adds 4 to the end
```

### 3. Iterating
You can loop through elements using index or iterators.
```cpp
// Range-based for loop (Modern C++)
for (int num : numbers) {
    std::cout << num << " ";
}
```

## Your Mission
1.  Study `tutorials/01_vectors.cpp`.
2.  Complete `exercises/vector_sum.cpp`.
