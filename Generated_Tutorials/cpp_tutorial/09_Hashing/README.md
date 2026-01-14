# Module 09: Hashing

## Overview
Hashing allows us to find items in O(1) time (on average). It's the secret sauce behind Dictionaries, Maps, and Sets.

## Key Concepts

### 1. Hash Function
A function that converts keys (like strings or big numbers) into small integer indices (table slots).
- Key -> Hash Function -> Index

### 2. Collisions
When two different keys map to the same index. Handled by:
- **Chaining** (Linked List at that slot)
- **Open Addressing** (Find next empty slot)

### 3. std::unordered_map & std::unordered_set
C++ STL implementations of Hash Tables.
- `unordered_set`: Stores unique keys.
- `unordered_map`: Stores Key-Value pairs.

## Your Mission
1.  Run `tutorials/01_hash_map.cpp`.
2.  Complete `exercises/two_sum.cpp`. This is *the* most famous LeetCode problem.
