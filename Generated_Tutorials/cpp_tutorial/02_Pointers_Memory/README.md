# Module 02: Pointers & Memory

## Overview
Pointers are one of the most powerful and feared features of C++. Understanding them is crucial for mastering DSA, as they are the backbone of Linked Lists, Trees, and Graphs.

## Key Concepts

### 1. Variables and Memory
Every variable goes to a specific address in memory.
- `&var`: The **address-of** operator. Gives you the memory address where `var` is stored.

### 2. Pointers (`*`)
A pointer is a variable that stores the memory address of another variable.
```cpp
int x = 10;
int* ptr = &x; // ptr holds the address of x
```
- `*ptr`: The **dereference** operator. Accesses the value stored at the address held by `ptr`.

### 3. References (`&`)
A reference is an alias for another variable. It's like a nickname.
```cpp
int x = 10;
int& ref = x; // ref is now another name for x
ref = 20; // x is also 20
```

### 4. Dynamic Memory (`new` / `delete`)
- `new int`: Allocates memory on the heap. Returns a pointer.
- `delete ptr`: Frees the memory. **Crucial to prevent memory leaks!**

## Your Mission
1.  Study `tutorials/01_pointers.cpp` to understand how `*` and `&` work.
2.  Complete `exercises/swap.cpp`. This is a classic interview question!
