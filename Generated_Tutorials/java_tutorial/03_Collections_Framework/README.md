# Module 03: Collections Framework

## Overview
Java has a rich set of pre-built data structures. You barely use raw arrays (`[]`) in production; you use **Collections**.

## Key Concepts

### 1. ArrayList (Dynamic Array)
Like C++ `std::vector`. Grows automatically.
```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.get(0); // Access
```

### 2. HashSet (Unique Items)
Stores unique elements. Fast lookup (O(1)).
```java
HashSet<Integer> ids = new HashSet<>();
ids.add(10);
ids.contains(10); // true
```

### 3. HashMap (Key-Value)
Like C++ `std::unordered_map` or Python `dict`.
```java
HashMap<String, Integer> grades = new HashMap<>();
grades.put("Bob", 90);
```

## Your Mission
1.  Study `src/CollectionsDemo.java`.
2.  Complete `exercises/UniqueNames.java`.
