# Module 04: Recursion

## Overview
Recursion is when a function calls itself. It's a powerful concept used in many advanced algorithms (like Tree traversals and Graph searches).

## Key Concepts

### 1. Base Case
The condition that stops the recursion. Without this, you get a "Stack Overflow" (infinite loop).

### 2. Recursive Step
The logic where the function calls itself with a smaller input.

### Example: Factorial
`5! = 5 * 4 * 3 * 2 * 1`
Generic rule: `n! = n * (n-1)!`

```cpp
int factorial(int n) {
    if (n <= 1) return 1; // Base Case
    return n * factorial(n - 1); // Recursive Step
}
```

## Your Mission
1.  Run `tutorials/01_recursion_visualized.cpp`. It uses our **Visualizer** tool to show you the call stack!
2.  Complete `exercises/fibonacci.cpp`.
