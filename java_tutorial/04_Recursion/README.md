# Module 04: Recursion

## Overview
Recursion is when a method calls itself. It's elegantly simple but can be tricky to debug.

## Key Concepts

### 1. Base Case
The condition to STOP.

### 2. Recursive Call
The function calling itself with a smaller input.

### Example
```java
public int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```

## Your Mission
1.  Run `src/RecursionVisualized.java`. See the stack trace light up!
2.  Complete `exercises/Fibonacci.java`.
