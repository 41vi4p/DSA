# Module 01: Java Basics

## Overview
Java is a class-based, object-oriented language. Every line of code must be inside a `class`.

## Key Concepts

### 1. Structure
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
- `public class`: Defines a class accessible by everyone.
- `public static void main`: The entry point.

### 2. Variables
- `int`, `double`, `boolean`, `char`: Primitives (store values directly).
- `String`: An Object (stores text).

### 3. I/O (Scanner)
To read input, we use the `Scanner` class.
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
```

## Your Mission
1.  Compile and run `src/VariablesIO.java`.
2.  Complete `exercises/SimpleCalculator.java`.
