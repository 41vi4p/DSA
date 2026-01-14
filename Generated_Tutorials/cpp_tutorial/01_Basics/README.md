# Module 01: C++ Basics

## Overview
Welcome to the start of your C++ journey! In this module, we will cover the fundamental building blocks of C++.

## Key Concepts

### 1. Structure of a C++ Program
Every C++ program must have a `main()` function. This is the entry point where execution begins.
```cpp
#include <iostream> // For Input/Output

int main() {
    std::cout << "Hello, World!" << std::endl;
    return 0; // 0 indicates success
}
```

### 2. Variables & Data Types
C++ is a statically typed language, meaning you must declare the type of a variable.
- `int`: Integers (e.g., 5, -10)
- `double`: Floating-point numbers (e.g., 3.14, -0.01)
- `char`: Single characters (e.g., 'a', 'Z')
- `bool`: True/False values
- `std::string`: Text (requires `<string>`)

### 3. I/O (Input/Output)
- `std::cout <<`: Print to console ("Character Output")
- `std::cin >>`: Read from console ("Character Input")

### 4. Control Flow
- **If/Else**: Make decisions.
- **Loops**: Repeat code (`for`, `while`).

### 5. Functions
Reusable blocks of code.
```cpp
ReturnType FunctionName(ParameterType param) {
    // code
    return value;
}
```

## Your Mission
1.  Explore the code in `tutorials/`. Compile and run them.
2.  Go to `exercises/simple_calculator.cpp` and complete the TODOs.
