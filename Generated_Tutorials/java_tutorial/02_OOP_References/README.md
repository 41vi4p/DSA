# Module 02: OOP & References

## Overview
Fundamental to DSA in Java is understanding how objects are stored in memory.

## Key Concepts

### 1. Classes & Objects
- A **Class** is a blueprint (e.g., `Car`).
- An **Object** is an instance (e.g., `myToyota`).

### 2. References
In Java, you don't use pointers `*` manually. You use References.
```java
Node a = new Node(10); // 'a' holds the ADDRESS of the object
Node b = a;            // 'b' now holds the SAME ADDRESS
```
If you change `b.data`, `a.data` also changes!

### 3. Primitive vs Reference
- **Primitive** (`int`, `char`): Stores value directly. Copies value on assignment.
- **Reference** (Objects, Arrays): Stores address. Copies address on assignment.

## Your Mission
1.  Study `src/ReferencesDemo.java`.
2.  Complete `exercises/BankAccount.java`.
