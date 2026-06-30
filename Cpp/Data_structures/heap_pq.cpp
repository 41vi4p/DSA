#include <iostream>
#include <queue>
#include <vector>
#include <unordered_map>
using namespace std;

// ============================================================
// PRIORITY QUEUE (Heap)
// Max heap by default — always gives you the LARGEST element
//
// Use when:
//   - K largest / K smallest elements
//   - Greedy: always process the best/worst available
//   - Dijkstra's shortest path
//   - Merge K sorted arrays/lists
//   - Median in data stream
// ============================================================

void pq_demo() {
    // --- MAX HEAP (default) ---
    priority_queue<int> maxH;
    maxH.push(3);
    maxH.push(10);
    maxH.push(1);
    maxH.push(7);

    cout << maxH.top() << "\n"; // 10 (max)
    maxH.pop();                 // remove 10
    cout << maxH.top() << "\n"; // 7

    // --- MIN HEAP ---
    priority_queue<int, vector<int>, greater<int>> minH;
    minH.push(3);
    minH.push(10);
    minH.push(1);

    cout << minH.top() << "\n"; // 1 (min)

    // --- HEAP OF PAIRS (sorted by first element) ---
    priority_queue<pair<int,int>> pq; // max by pair.first
    pq.push({5, 100});
    pq.push({2, 200});
    pq.push({8, 300});

    auto [dist, node] = pq.top(); // 8, 300
    cout << dist << " " << node << "\n";
}

// ============================================================
// INTERVIEW PATTERNS
// ============================================================

// Pattern 1: K Largest Elements — use MIN heap of size k
// Idea: maintain k largest seen so far; if new element > min, swap
vector<int> kLargest(vector<int>& nums, int k) {
    priority_queue<int, vector<int>, greater<int>> minH; // min heap
    for (int x : nums) {
        minH.push(x);
        if ((int)minH.size() > k)
            minH.pop(); // remove smallest
    }
    vector<int> res;
    while (!minH.empty()) { res.push_back(minH.top()); minH.pop(); }
    return res; // not sorted, but these are the k largest
}

// Pattern 2: Kth Largest Element
int kthLargest(vector<int>& nums, int k) {
    priority_queue<int, vector<int>, greater<int>> minH;
    for (int x : nums) {
        minH.push(x);
        if ((int)minH.size() > k) minH.pop();
    }
    return minH.top(); // kth largest
}

// Pattern 3: Top K Frequent Elements — O(n log k)
vector<int> topKFrequent(vector<int>& nums, int k) {
    unordered_map<int,int> freq;
    for (int x : nums) freq[x]++;

    // Min heap of (count, value)
    priority_queue<pair<int,int>, vector<pair<int,int>>, greater<>> pq;
    for (auto& [val, cnt] : freq) {
        pq.push({cnt, val});
        if ((int)pq.size() > k) pq.pop();
    }

    vector<int> res;
    while (!pq.empty()) { res.push_back(pq.top().second); pq.pop(); }
    return res;
}

// Pattern 4: Merge K Sorted Lists (using min heap)
// Imagine each list has a "current pointer"
struct Node { int val, listIdx, elemIdx; };
auto cmp = [](Node a, Node b) { return a.val > b.val; }; // min heap

vector<int> mergeKSorted(vector<vector<int>>& lists) {
    priority_queue<Node, vector<Node>, decltype(cmp)> pq(cmp);

    // Push first element of each list
    for (int i = 0; i < (int)lists.size(); i++)
        if (!lists[i].empty())
            pq.push({lists[i][0], i, 0});

    vector<int> res;
    while (!pq.empty()) {
        auto [val, li, ei] = pq.top(); pq.pop();
        res.push_back(val);
        if (ei + 1 < (int)lists[li].size())
            pq.push({lists[li][ei+1], li, ei+1});
    }
    return res;
}

// Pattern 5: Find Median from Data Stream
class MedianFinder {
    priority_queue<int> lo;                              // max heap (lower half)
    priority_queue<int,vector<int>,greater<int>> hi;    // min heap (upper half)
public:
    void addNum(int num) {
        lo.push(num);               // always push to lower half first
        hi.push(lo.top()); lo.pop(); // balance: move max of lo to hi
        if (hi.size() > lo.size())  // keep lo.size() >= hi.size()
            { lo.push(hi.top()); hi.pop(); }
    }
    double findMedian() {
        if (lo.size() > hi.size()) return lo.top();
        return (lo.top() + hi.top()) / 2.0;
    }
};

int main() {
    cout << "=== Priority Queue Demo ===\n";
    pq_demo();

    cout << "\n=== K Largest (k=3) ===\n";
    vector<int> nums = {3, 2, 1, 5, 6, 4};
    auto res = kLargest(nums, 3);
    for (int x : res) cout << x << " "; // 4 5 6 (any order)
    cout << "\n";

    cout << "\n=== Kth Largest (k=2) ===\n";
    cout << kthLargest(nums, 2) << "\n"; // 5

    cout << "\n=== Merge K Sorted ===\n";
    vector<vector<int>> lists = {{1,4,7},{2,5,8},{3,6,9}};
    auto merged = mergeKSorted(lists);
    for (int x : merged) cout << x << " "; // 1 2 3 4 5 6 7 8 9
    cout << "\n";

    cout << "\n=== Median Finder ===\n";
    MedianFinder mf;
    mf.addNum(1); mf.addNum(2);
    cout << mf.findMedian() << "\n"; // 1.5
    mf.addNum(3);
    cout << mf.findMedian() << "\n"; // 2

    return 0;
}
