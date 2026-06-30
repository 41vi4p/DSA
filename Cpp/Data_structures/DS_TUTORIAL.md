# C++ Data Structures Tutorial for DSA & Job Interviews

> Reference guide: syntax, operations, time complexities, and when to use each structure.

---

## Table of Contents
1. [Vector (Dynamic Array)](#1-vector)
2. [String](#2-string)
3. [Stack](#3-stack)
4. [Queue](#4-queue)
5. [Deque (Double-Ended Queue)](#5-deque)
6. [Priority Queue (Heap)](#6-priority-queue)
7. [Unordered Map (Hash Map)](#7-unordered-map-hash-map)
8. [Map (Ordered / BST)](#8-map-ordered)
9. [Unordered Set (Hash Set)](#9-unordered-set)
10. [Set (Ordered)](#10-set-ordered)
11. [Multiset](#11-multiset)
12. [Pair & Tuple](#12-pair--tuple)
13. [List (Doubly Linked List)](#13-list)
14. [Decision Guide: When to Use What](#14-decision-guide)
15. [Common Interview Patterns](#15-common-interview-patterns)

---

## 1. Vector

**Header:** `#include <vector>`

**What it is:** Dynamic resizing array. Contiguous memory. Go-to data structure.

**When to use:**
- You need a resizable array
- Random access by index is needed
- Building result arrays to return
- Sliding window, two pointers

```cpp
// --- DECLARATION ---
vector<int> v;                      // empty
vector<int> v(5);                   // size 5, all 0
vector<int> v(5, -1);              // size 5, all -1
vector<int> v = {1, 2, 3, 4, 5};  // initializer list
vector<int> v(other.begin(), other.end()); // copy from another container

// 2D vector (n rows, m cols, all 0)
vector<vector<int>> grid(n, vector<int>(m, 0));

// --- ADD / REMOVE ---
v.push_back(10);      // add to end — O(1) amortized
v.pop_back();         // remove from end — O(1)
v.insert(v.begin() + i, val); // insert at index i — O(n)
v.erase(v.begin() + i);       // remove at index i — O(n)
v.erase(v.begin() + i, v.begin() + j); // remove range [i, j) — O(n)
v.clear();            // remove all elements — O(n)

// --- ACCESS ---
v[i];                 // index access — O(1), NO bounds check
v.at(i);              // index access — O(1), WITH bounds check (throws)
v.front();            // first element — O(1)
v.back();             // last element — O(1)

// --- SIZE / INFO ---
v.size();             // number of elements (returns size_t, unsigned)
v.empty();            // true if empty
v.capacity();         // allocated space (>= size)
v.reserve(100);       // pre-allocate space (avoids reallocation)
v.resize(n);          // resize to n elements (fills with 0 if growing)
v.resize(n, val);     // resize and fill new elements with val

// --- ITERATION ---
for (int x : v) { }                        // range-based for
for (int i = 0; i < v.size(); i++) { }     // index-based
for (auto it = v.begin(); it != v.end(); it++) { } // iterator

// --- SORT & SEARCH ---
sort(v.begin(), v.end());                   // ascending — O(n log n)
sort(v.begin(), v.end(), greater<int>());   // descending
sort(v.begin(), v.end(), [](int a, int b){ return a > b; }); // custom comparator

reverse(v.begin(), v.end());               // reverse in-place — O(n)

// Binary search (array must be sorted)
binary_search(v.begin(), v.end(), target); // returns bool — O(log n)
lower_bound(v.begin(), v.end(), x);        // iterator to first >= x
upper_bound(v.begin(), v.end(), x);        // iterator to first > x
// To get index: lower_bound(...) - v.begin()

// Min / Max
int mx = *max_element(v.begin(), v.end()); // O(n)
int mn = *min_element(v.begin(), v.end()); // O(n)

// Sum
int s = accumulate(v.begin(), v.end(), 0); // O(n), needs <numeric>

// Count occurrences
int cnt = count(v.begin(), v.end(), val);  // O(n)

// Fill
fill(v.begin(), v.end(), 0);              // set all to 0 — O(n)
```

**Key pitfall:** `v.size()` returns `unsigned`. If `v` is empty, `v.size() - 1` wraps to a huge number. Use `(int)v.size()` or check `!v.empty()` first.

---

## 2. String

**Header:** `#include <string>`

**When to use:**
- Text processing, palindromes, anagrams, substring problems

```cpp
// --- DECLARATION ---
string s = "hello";
string s(5, 'a');          // "aaaaa"
string s = to_string(42);  // int to string

// --- ACCESS ---
s[i];                      // char at index — O(1)
s.front();                 // first char
s.back();                  // last char

// --- SIZE ---
s.size();    // or s.length() — O(1)
s.empty();

// --- MODIFY ---
s.push_back('x');          // append char — O(1)
s.pop_back();              // remove last char — O(1)
s += "world";              // append string — O(n)
s.append("world");         // same
s.insert(i, "abc");        // insert at index i
s.erase(i, len);           // erase 'len' chars starting at i
s.replace(i, len, "new");  // replace 'len' chars at i with "new"
s.clear();

// --- SEARCH ---
s.find("sub");             // index of first occurrence, or string::npos
s.rfind("sub");            // last occurrence
s.find('c');               // find char
// Check: if (s.find("abc") != string::npos)

// --- SUBSTRING ---
s.substr(i);               // from index i to end
s.substr(i, len);          // from i, length len

// --- COMPARE ---
s1 == s2;                  // equality
s1 < s2;                   // lexicographic (works in set/map)
s.compare(s2);             // 0 if equal

// --- CONVERSION ---
stoi(s);                   // string to int
stol(s);                   // string to long
stoll(s);                  // string to long long
stod(s);                   // string to double
to_string(42);             // number to string

// --- USEFUL ---
reverse(s.begin(), s.end());
sort(s.begin(), s.end());
// Check if char is digit/alpha
isdigit(c);   isalpha(c);   isalnum(c);   islower(c);   isupper(c);
tolower(c);   toupper(c);
```

**Common pattern — frequency count:**
```cpp
vector<int> freq(26, 0);
for (char c : s) freq[c - 'a']++;
```

---

## 3. Stack

**Header:** `#include <stack>`

**What it is:** LIFO — Last In, First Out.

**When to use:**
- Matching brackets/parentheses
- Monotonic stack (next greater/smaller element)
- DFS (iterative)
- Undo operations
- Expression evaluation

```cpp
// --- DECLARATION ---
stack<int> st;
stack<char> st;
stack<pair<int,int>> st;

// --- OPERATIONS ---
st.push(5);       // add to top — O(1)
st.pop();         // remove top — O(1), returns void!
st.top();         // peek top — O(1), does NOT remove
st.empty();       // true if empty
st.size();        // number of elements

// IMPORTANT: Always check empty() before top() or pop()
if (!st.empty()) {
    int x = st.top();
    st.pop();
}
```

**Classic patterns:**
```cpp
// --- Valid Parentheses ---
bool isValid(string s) {
    stack<char> st;
    for (char c : s) {
        if (c == '(' || c == '{' || c == '[') st.push(c);
        else {
            if (st.empty()) return false;
            char top = st.top(); st.pop();
            if (c == ')' && top != '(') return false;
            if (c == '}' && top != '{') return false;
            if (c == ']' && top != '[') return false;
        }
    }
    return st.empty();
}

// --- Monotonic Stack: Next Greater Element ---
// For each element, find the next element that is greater
vector<int> nextGreater(vector<int>& nums) {
    int n = nums.size();
    vector<int> res(n, -1);
    stack<int> st;  // stores indices, not values
    for (int i = 0; i < n; i++) {
        while (!st.empty() && nums[st.top()] < nums[i]) {
            res[st.top()] = nums[i];
            st.pop();
        }
        st.push(i);
    }
    return res;
}
```

---

## 4. Queue

**Header:** `#include <queue>`

**What it is:** FIFO — First In, First Out.

**When to use:**
- BFS (graphs, trees, level-order traversal)
- Task scheduling
- Any "process in order" scenario

```cpp
// --- DECLARATION ---
queue<int> q;
queue<pair<int,int>> q;  // useful for BFS with coordinates

// --- OPERATIONS ---
q.push(5);    // enqueue to back — O(1)
q.pop();      // dequeue from front — O(1), returns void!
q.front();    // peek front — O(1)
q.back();     // peek back — O(1)
q.empty();
q.size();
```

**BFS Template:**
```cpp
// Graph BFS
void bfs(int start, vector<vector<int>>& adj) {
    int n = adj.size();
    vector<bool> visited(n, false);
    queue<int> q;
    q.push(start);
    visited[start] = true;

    while (!q.empty()) {
        int node = q.front(); q.pop();
        // process node
        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                q.push(neighbor);
            }
        }
    }
}

// Grid BFS (shortest path in grid)
int bfsGrid(vector<vector<int>>& grid, int sr, int sc, int er, int ec) {
    int m = grid.size(), n = grid[0].size();
    vector<vector<bool>> visited(m, vector<bool>(n, false));
    queue<tuple<int,int,int>> q;  // row, col, distance
    q.push({sr, sc, 0});
    visited[sr][sc] = true;
    int dirs[4][2] = {{0,1},{0,-1},{1,0},{-1,0}};

    while (!q.empty()) {
        auto [r, c, dist] = q.front(); q.pop();
        if (r == er && c == ec) return dist;
        for (auto& d : dirs) {
            int nr = r + d[0], nc = c + d[1];
            if (nr >= 0 && nr < m && nc >= 0 && nc < n
                && !visited[nr][nc] && grid[nr][nc] != 1) {
                visited[nr][nc] = true;
                q.push({nr, nc, dist + 1});
            }
        }
    }
    return -1;
}
```

---

## 5. Deque

**Header:** `#include <deque>`

**What it is:** Double-ended queue. O(1) push/pop at BOTH front and back.

**When to use:**
- Sliding window maximum/minimum (monotonic deque)
- When you need queue + ability to add/remove from front
- BFS with priority tweaks (0-1 BFS)

```cpp
// --- DECLARATION ---
deque<int> dq;

// --- OPERATIONS ---
dq.push_back(5);   // add to back — O(1)
dq.push_front(5);  // add to front — O(1)
dq.pop_back();     // remove from back — O(1)
dq.pop_front();    // remove from front — O(1)
dq.back();         // peek back
dq.front();        // peek front
dq[i];             // random access — O(1)
dq.empty();
dq.size();
```

**Sliding Window Maximum:**
```cpp
// Find max in every window of size k
vector<int> maxSlidingWindow(vector<int>& nums, int k) {
    deque<int> dq;  // stores INDICES, maintains decreasing order of VALUES
    vector<int> res;

    for (int i = 0; i < nums.size(); i++) {
        // Remove index that is out of window
        if (!dq.empty() && dq.front() <= i - k)
            dq.pop_front();

        // Remove indices with values smaller than current (they can never be max)
        while (!dq.empty() && nums[dq.back()] < nums[i])
            dq.pop_back();

        dq.push_back(i);

        if (i >= k - 1)
            res.push_back(nums[dq.front()]);  // front is always the max
    }
    return res;
}
```

---

## 6. Priority Queue (Heap)

**Header:** `#include <queue>`

**What it is:** Always gives you the max (or min) element. Internally a heap.

**When to use:**
- K largest/smallest elements
- Merge K sorted lists
- Dijkstra's algorithm
- Greedy problems needing "best" element repeatedly
- Top K frequent elements

```cpp
// --- MAX HEAP (default) ---
priority_queue<int> pq;
pq.push(5);        // insert — O(log n)
pq.top();          // get max — O(1)
pq.pop();          // remove max — O(log n)
pq.empty();
pq.size();

// --- MIN HEAP ---
priority_queue<int, vector<int>, greater<int>> pq;
// Same operations, but pq.top() gives MINIMUM

// --- CUSTOM COMPARATOR ---
// For pairs: sort by second element (descending)
auto cmp = [](pair<int,int> a, pair<int,int> b) {
    return a.second < b.second;  // max heap by second
};
priority_queue<pair<int,int>, vector<pair<int,int>>, decltype(cmp)> pq(cmp);

// Easier: just push negative values for min-heap behavior
priority_queue<int> pq;  // max heap
pq.push(-val);           // push negative
int x = -pq.top();       // get actual min value
```

**K Largest Elements:**
```cpp
// Return k largest elements using min-heap of size k
vector<int> kLargest(vector<int>& nums, int k) {
    priority_queue<int, vector<int>, greater<int>> minHeap;
    for (int x : nums) {
        minHeap.push(x);
        if (minHeap.size() > k)
            minHeap.pop();  // remove smallest
    }
    vector<int> res;
    while (!minHeap.empty()) {
        res.push_back(minHeap.top());
        minHeap.pop();
    }
    return res;
}
```

**Top K Frequent:**
```cpp
vector<int> topKFrequent(vector<int>& nums, int k) {
    unordered_map<int,int> freq;
    for (int x : nums) freq[x]++;

    // min-heap of (frequency, value)
    priority_queue<pair<int,int>, vector<pair<int,int>>, greater<>> pq;
    for (auto& [val, cnt] : freq) {
        pq.push({cnt, val});
        if (pq.size() > k) pq.pop();
    }

    vector<int> res;
    while (!pq.empty()) { res.push_back(pq.top().second); pq.pop(); }
    return res;
}
```

---

## 7. Unordered Map (Hash Map)

**Header:** `#include <unordered_map>`

**What it is:** Key-value store using hashing. Average O(1) for all ops.

**When to use:**
- Frequency counting
- Checking if seen before (visited)
- Caching / memoization
- Two Sum pattern (store complement)
- Anagram checking
- When you need O(1) lookup and ORDER DOESN'T MATTER

```cpp
// --- DECLARATION ---
unordered_map<string, int> mp;
unordered_map<int, vector<int>> mp;  // value can be any type

// --- INSERT / UPDATE ---
mp["key"] = 5;          // insert or update — O(1) avg
mp.insert({"key", 5});  // insert only if key doesn't exist
mp["count"]++;          // increment (auto-initializes to 0)

// --- ACCESS ---
mp["key"];              // O(1) avg — inserts 0 if key missing!
mp.at("key");           // O(1) avg — throws if key missing (safer)

// --- CHECK EXISTENCE ---
mp.count("key");        // 1 if exists, 0 if not — O(1) avg
mp.find("key") != mp.end();  // same, but gives iterator

// --- REMOVE ---
mp.erase("key");        // O(1) avg

// --- ITERATE ---
for (auto& [key, val] : mp) {     // structured bindings (C++17)
    cout << key << " -> " << val;
}
for (auto& p : mp) {              // C++11 style
    cout << p.first << " -> " << p.second;
}

// --- SIZE ---
mp.size();
mp.empty();
mp.clear();
```

**Common patterns:**
```cpp
// --- Two Sum ---
vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int,int> seen;  // value -> index
    for (int i = 0; i < nums.size(); i++) {
        int complement = target - nums[i];
        if (seen.count(complement))
            return {seen[complement], i};
        seen[nums[i]] = i;
    }
    return {};
}

// --- Frequency Count ---
unordered_map<char, int> freq;
for (char c : s) freq[c]++;

// --- Group Anagrams ---
unordered_map<string, vector<string>> groups;
for (string& s : strs) {
    string key = s;
    sort(key.begin(), key.end());
    groups[key].push_back(s);
}
```

---

## 8. Map (Ordered)

**Header:** `#include <map>`

**What it is:** Key-value store using Red-Black BST. Always sorted by key. O(log n) ops.

**When to use:**
- Need keys in sorted order
- Range queries on keys
- Find floor/ceiling of a key
- Ordered traversal matters
- When ORDER MATTERS (use over unordered_map)

```cpp
// --- DECLARATION ---
map<int, int> mp;
map<string, int> mp;

// --- ALL SAME OPERATIONS AS unordered_map BUT SORTED ---
mp[key] = val;
mp.count(key);
mp.find(key);
mp.erase(key);

// --- ORDERED-SPECIFIC ---
mp.begin();         // iterator to smallest key
mp.rbegin();        // iterator to largest key (reverse)

// Lower/upper bound (very useful!)
mp.lower_bound(x);  // iterator to first key >= x
mp.upper_bound(x);  // iterator to first key > x
// Use .first for key, .second for value

// Example: find nearest key
auto it = mp.lower_bound(x);
if (it != mp.end())    cout << it->first;   // smallest key >= x
if (it != mp.begin()) { --it; cout << it->first; } // largest key < x
```

**When to choose map vs unordered_map:**
- `unordered_map`: O(1) avg, no ordering needed → faster
- `map`: O(log n), need sorted keys / range queries → use when order matters

---

## 9. Unordered Set

**Header:** `#include <unordered_set>`

**What it is:** Collection of unique elements with O(1) avg lookup.

**When to use:**
- Check if element exists (visited, seen)
- Remove duplicates
- Finding duplicates in array
- When you only care about existence, not value

```cpp
// --- DECLARATION ---
unordered_set<int> st;
unordered_set<string> st;

// --- INSERT ---
st.insert(5);         // O(1) avg — no-op if already exists
st.insert({1,2,3});   // insert multiple

// --- CHECK ---
st.count(5);          // 1 if exists, 0 if not — O(1) avg
st.find(5) != st.end();  // same

// --- REMOVE ---
st.erase(5);          // O(1) avg

// --- ITERATE ---
for (int x : st) { }  // unordered!

// --- SIZE ---
st.size();
st.empty();
st.clear();

// Initialize from vector (remove duplicates)
vector<int> v = {1, 2, 2, 3};
unordered_set<int> st(v.begin(), v.end());  // {1, 2, 3}
```

**Longest Consecutive Sequence pattern:**
```cpp
int longestConsecutive(vector<int>& nums) {
    unordered_set<int> st(nums.begin(), nums.end());
    int res = 0;
    for (int n : st) {
        if (!st.count(n - 1)) {  // start of a sequence
            int len = 1;
            while (st.count(n + len)) len++;
            res = max(res, len);
        }
    }
    return res;
}
```

---

## 10. Set (Ordered)

**Header:** `#include <set>`

**What it is:** Sorted unique elements using BST. O(log n) ops.

**When to use:**
- Unique elements in sorted order
- Floor/ceiling queries
- Range queries
- Efficiently maintain sorted order with insertions/deletions

```cpp
// --- DECLARATION ---
set<int> st;

// --- INSERT / ERASE ---
st.insert(5);         // O(log n)
st.erase(5);          // O(log n) by value
st.erase(st.find(5)); // O(log n) by iterator

// --- CHECK ---
st.count(5);          // 1 if exists
st.find(5) != st.end();

// --- ORDERED OPERATIONS ---
st.begin();           // smallest element (iterator)
st.rbegin();          // largest element (reverse iterator)
*st.begin();          // get value: smallest
*st.rbegin();         // get value: largest

// Floor / Ceiling
auto it = st.lower_bound(x);   // first element >= x
auto it = st.upper_bound(x);   // first element > x
// Floor (largest element <= x):
auto it = st.lower_bound(x);
if (it != st.begin() && (it == st.end() || *it != x)) --it;
```

---

## 11. Multiset

**Header:** `#include <set>`

**What it is:** Like set but allows DUPLICATE elements. Sorted.

**When to use:**
- Need sorted structure with duplicates allowed
- Sliding window median
- Efficiently find min/max while inserting/deleting

```cpp
multiset<int> ms;

ms.insert(5);           // O(log n)
ms.insert(5);           // allowed! ms = {5, 5}

ms.erase(5);            // removes ALL 5s!
ms.erase(ms.find(5));   // removes exactly ONE 5

ms.count(5);            // count of 5s
*ms.begin();            // smallest
*ms.rbegin();           // largest
```

---

## 12. Pair & Tuple

**Header:** `#include <utility>` (pair, auto-included usually)

```cpp
// --- PAIR ---
pair<int, int> p = {1, 2};
pair<int, string> p = make_pair(1, "hello");

p.first;   // 1
p.second;  // "hello"

// Pairs are compared lexicographically: first by .first, then .second
// Great for sorting by multiple criteria
vector<pair<int,int>> v = {{1,3},{1,2},{2,1}};
sort(v.begin(), v.end()); // → {1,2}, {1,3}, {2,1}

// Common use: store (value, index) together
vector<pair<int,int>> indexed;
for (int i = 0; i < nums.size(); i++)
    indexed.push_back({nums[i], i});
sort(indexed.begin(), indexed.end()); // sort by value

// --- TUPLE (3+ elements) ---
tuple<int, int, int> t = {1, 2, 3};
get<0>(t);   // 1
get<1>(t);   // 2

// C++17 structured bindings (much cleaner)
auto [a, b, c] = t;

// In queues/heaps:
queue<tuple<int,int,int>> q;
q.push({r, c, dist});
auto [r, c, dist] = q.front(); q.pop();
```

---

## 13. List

**Header:** `#include <list>`

**What it is:** Doubly linked list. O(1) insert/remove at any known iterator position.

**When to use:**
- Rarely in interviews — prefer vector
- LRU Cache (combined with unordered_map)
- When frequent insertion/deletion in middle (by iterator)

```cpp
list<int> lst;

lst.push_back(5);      // O(1)
lst.push_front(5);     // O(1)
lst.pop_back();        // O(1)
lst.pop_front();       // O(1)
lst.front();
lst.back();

// Insert at iterator position — O(1)
auto it = lst.begin();
lst.insert(it, 10);
lst.erase(it);

// No random access! Can't do lst[i]
```

**LRU Cache pattern (important interview question):**
```cpp
class LRUCache {
    int cap;
    list<pair<int,int>> lst;  // {key, value}, front = most recent
    unordered_map<int, list<pair<int,int>>::iterator> mp; // key -> iterator

public:
    LRUCache(int capacity) : cap(capacity) {}

    int get(int key) {
        if (!mp.count(key)) return -1;
        lst.splice(lst.begin(), lst, mp[key]); // move to front
        return mp[key]->second;
    }

    void put(int key, int value) {
        if (mp.count(key)) {
            lst.erase(mp[key]);
            mp.erase(key);
        }
        lst.push_front({key, value});
        mp[key] = lst.begin();
        if (lst.size() > cap) {
            mp.erase(lst.back().first);
            lst.pop_back();
        }
    }
};
```

---

## 14. Decision Guide

### "Which data structure should I use?"

| Need | Use |
|------|-----|
| Dynamic array, random access | `vector` |
| LIFO, undo, DFS | `stack` |
| FIFO, BFS | `queue` |
| O(1) front & back push/pop | `deque` |
| Sliding window max/min | `deque` (monotonic) |
| Always access max element | `priority_queue` (max heap) |
| Always access min element | `priority_queue<T, vector<T>, greater<T>>` (min heap) |
| Key-value, O(1) lookup, order doesn't matter | `unordered_map` |
| Key-value, sorted keys, range queries | `map` |
| Existence check, O(1) | `unordered_set` |
| Unique sorted elements, floor/ceil | `set` |
| Sorted with duplicates, min/max tracking | `multiset` |
| LRU Cache | `list` + `unordered_map` |
| Multiple values together | `pair` / `tuple` |

### Common Interview Signal → Data Structure

| Signal | Think |
|--------|-------|
| "Find if exists" | `unordered_set` or `unordered_map` |
| "Frequency / count" | `unordered_map<T, int>` |
| "K largest/smallest" | `priority_queue` (min-heap of size k) |
| "Sorted order needed" | `map` or `set` |
| "Matching brackets" | `stack` |
| "Next greater element" | monotonic `stack` |
| "Shortest path in grid/graph" | BFS with `queue` |
| "Level order traversal" | BFS with `queue` |
| "Sliding window" | two pointers on `vector`, or monotonic `deque` |
| "Remove duplicates" | `unordered_set` |
| "Process in insertion order" | `queue` or `vector` |
| "Access min AND max" | two heaps or `multiset` with iterators |

---

## 15. Common Interview Patterns

### Pattern 1: Two Pointers (Sorted Array)
```cpp
// Find pair summing to target
int l = 0, r = v.size() - 1;
while (l < r) {
    int sum = v[l] + v[r];
    if (sum == target) { /* found */ break; }
    else if (sum < target) l++;
    else r--;
}
```

### Pattern 2: Sliding Window (Fixed Size)
```cpp
// Maximum sum of subarray of size k
int windowSum = 0, maxSum = 0;
for (int i = 0; i < nums.size(); i++) {
    windowSum += nums[i];
    if (i >= k) windowSum -= nums[i - k];  // remove element leaving window
    if (i >= k - 1) maxSum = max(maxSum, windowSum);
}
```

### Pattern 3: Sliding Window (Variable Size)
```cpp
// Longest substring without repeating characters
int l = 0, maxLen = 0;
unordered_map<char, int> lastSeen;
for (int r = 0; r < s.size(); r++) {
    if (lastSeen.count(s[r]) && lastSeen[s[r]] >= l)
        l = lastSeen[s[r]] + 1;  // shrink window
    lastSeen[s[r]] = r;
    maxLen = max(maxLen, r - l + 1);
}
```

### Pattern 4: Prefix Sum
```cpp
// Range sum query in O(1) after O(n) preprocessing
vector<int> prefix(n + 1, 0);
for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + nums[i];
// Sum of nums[l..r] = prefix[r+1] - prefix[l]
```

### Pattern 5: DFS on Graph/Tree (Recursive)
```cpp
void dfs(int node, vector<vector<int>>& adj, vector<bool>& visited) {
    visited[node] = true;
    // process node
    for (int neighbor : adj[node]) {
        if (!visited[neighbor])
            dfs(neighbor, adj, visited);
    }
}
```

### Pattern 6: Binary Search (on answer)
```cpp
// When answer has monotonic property (if X works, X-1 also works)
int lo = 0, hi = maxPossible;
while (lo < hi) {
    int mid = lo + (hi - lo) / 2;  // avoid overflow
    if (canAchieve(mid)) hi = mid;  // try smaller
    else lo = mid + 1;
}
// lo = minimum value that works
```

### Pattern 7: Union-Find (Disjoint Set)
```cpp
class UnionFind {
    vector<int> parent, rank;
public:
    UnionFind(int n) : parent(n), rank(n, 0) {
        iota(parent.begin(), parent.end(), 0);  // parent[i] = i
    }
    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);  // path compression
        return parent[x];
    }
    bool unite(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return false;  // already connected
        if (rank[px] < rank[py]) swap(px, py);
        parent[py] = px;
        if (rank[px] == rank[py]) rank[px]++;
        return true;
    }
    bool connected(int x, int y) { return find(x) == find(y); }
};
// Use for: number of islands, connected components, detect cycle
```

### Pattern 8: Monotonic Stack (Histogram / Trap Rain Water)
```cpp
// Largest rectangle in histogram
int largestRectangle(vector<int>& heights) {
    stack<int> st;  // monotonically increasing stack of indices
    int maxArea = 0;
    heights.push_back(0);  // sentinel
    for (int i = 0; i < heights.size(); i++) {
        while (!st.empty() && heights[st.top()] > heights[i]) {
            int h = heights[st.top()]; st.pop();
            int w = st.empty() ? i : i - st.top() - 1;
            maxArea = max(maxArea, h * w);
        }
        st.push(i);
    }
    return maxArea;
}
```

### Pattern 9: Dijkstra's (Shortest Path with Weights)
```cpp
vector<int> dijkstra(int src, vector<vector<pair<int,int>>>& adj, int n) {
    vector<int> dist(n, INT_MAX);
    priority_queue<pair<int,int>, vector<pair<int,int>>, greater<>> pq;
    dist[src] = 0;
    pq.push({0, src});  // {distance, node}

    while (!pq.empty()) {
        auto [d, u] = pq.top(); pq.pop();
        if (d > dist[u]) continue;  // outdated entry
        for (auto [v, w] : adj[u]) {
            if (dist[u] + w < dist[v]) {
                dist[v] = dist[u] + w;
                pq.push({dist[v], v});
            }
        }
    }
    return dist;
}
```

---

## Quick Reference: Time Complexities

| Operation | vector | unordered_map | map | unordered_set | set | stack/queue | priority_queue |
|-----------|--------|---------------|-----|---------------|-----|-------------|----------------|
| Insert    | O(1)* / O(n) middle | O(1) avg | O(log n) | O(1) avg | O(log n) | O(1) | O(log n) |
| Delete    | O(1) end / O(n) mid | O(1) avg | O(log n) | O(1) avg | O(log n) | O(1) | O(log n) |
| Search    | O(n) / O(log n) sorted | O(1) avg | O(log n) | O(1) avg | O(log n) | — | — |
| Access max/min | O(n) | — | O(log n) iter | — | O(log n) iter | — | O(1) |

`*` amortized

---

## Key Things to Memorize

1. `stack`: `push`, `pop` (void!), `top`, `empty`
2. `queue`: `push`, `pop` (void!), `front`, `back`, `empty`
3. `priority_queue`: `push`, `pop` (void!), `top`, `empty` — default is MAX heap
4. `map/set` vs `unordered_map/set`: ordered = O(log n), unordered = O(1) avg
5. `lower_bound`: first element **>=** x; `upper_bound`: first element **>** x
6. Always check `.empty()` before calling `top()`, `front()`, `back()`
7. `unordered_map[key]` auto-inserts 0 if key missing — use `.count(key)` to check first
8. `multiset.erase(val)` removes ALL — use `ms.erase(ms.find(val))` for one
