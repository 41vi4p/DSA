#include <iostream>
#include <unordered_set>
#include <set>
#include <multiset>  // part of <set>
#include <vector>
using namespace std;

// ============================================================
// UNORDERED_SET — O(1) avg, unordered unique elements
// Use when: existence check, remove duplicates, visited nodes
//
// SET — O(log n), sorted unique elements
// Use when: ordered unique elements, floor/ceil, range queries
//
// MULTISET — O(log n), sorted, allows DUPLICATES
// Use when: sliding window median, ordered with duplicates
// ============================================================

void unordered_set_demo() {
    unordered_set<int> st;

    // Insert
    st.insert(3);
    st.insert(1);
    st.insert(3); // duplicate — ignored
    cout << st.size() << "\n"; // 2

    // Check existence
    if (st.count(3))             cout << "3 exists\n";
    if (st.find(5) == st.end())  cout << "5 not found\n";

    // Remove
    st.erase(3);
    cout << st.count(3) << "\n"; // 0

    // Init from vector (deduplicate)
    vector<int> v = {1, 2, 2, 3, 3, 3};
    unordered_set<int> deduped(v.begin(), v.end());
    cout << deduped.size() << "\n"; // 3
}

void ordered_set_demo() {
    set<int> st = {5, 2, 8, 1, 9, 3};
    // Internally sorted: {1, 2, 3, 5, 8, 9}

    // Smallest and Largest
    cout << *st.begin()  << "\n"; // 1
    cout << *st.rbegin() << "\n"; // 9

    // Ceiling: smallest element >= x
    auto it = st.lower_bound(4);
    cout << *it << "\n"; // 5

    // Floor: largest element <= x
    auto it2 = st.upper_bound(4); // first > 4
    --it2;
    cout << *it2 << "\n"; // 3

    // Insert / Erase
    st.insert(6);
    st.erase(5);

    // Iterate in sorted order
    for (int x : st) cout << x << " ";
    cout << "\n"; // 1 2 3 6 8 9
}

void multiset_demo() {
    multiset<int> ms;
    ms.insert(3);
    ms.insert(3); // allowed
    ms.insert(1);
    ms.insert(5);
    // ms = {1, 3, 3, 5}

    cout << ms.count(3) << "\n"; // 2

    // IMPORTANT: erase(val) removes ALL occurrences!
    // ms.erase(3);   // removes both 3s — BAD if you want to remove one

    // Remove exactly ONE occurrence:
    ms.erase(ms.find(3)); // removes one 3
    // ms = {1, 3, 5}

    cout << *ms.begin()  << "\n"; // 1 (min)
    cout << *ms.rbegin() << "\n"; // 5 (max)
}

// ============================================================
// INTERVIEW PATTERNS
// ============================================================

// Pattern 1: Longest Consecutive Sequence — O(n)
int longestConsecutive(vector<int>& nums) {
    unordered_set<int> st(nums.begin(), nums.end());
    int res = 0;
    for (int n : st) {
        if (!st.count(n - 1)) { // n is the START of a sequence
            int len = 1;
            while (st.count(n + len)) len++;
            res = max(res, len);
        }
    }
    return res;
}

// Pattern 2: Contains Duplicate
bool containsDuplicate(vector<int>& nums) {
    unordered_set<int> seen;
    for (int x : nums) {
        if (seen.count(x)) return true;
        seen.insert(x);
    }
    return false;
}

// Pattern 3: Sliding Window with Set (contains duplicate within k distance)
bool containsNearbyDuplicate(vector<int>& nums, int k) {
    unordered_set<int> window;
    for (int i = 0; i < (int)nums.size(); i++) {
        if (window.count(nums[i])) return true;
        window.insert(nums[i]);
        if ((int)window.size() > k)
            window.erase(nums[i - k]); // shrink window
    }
    return false;
}

// Pattern 4: Sliding Window Median using two multisets
// Maintain lower half (max via rbegin) and upper half (min via begin)
class SlidingWindowMedian {
    multiset<int> lo, hi; // lo = lower half, hi = upper half

    void rebalance() {
        while (lo.size() > hi.size() + 1) { hi.insert(*lo.rbegin()); lo.erase(prev(lo.end())); }
        while (hi.size() > lo.size())      { lo.insert(*hi.begin());  hi.erase(hi.begin()); }
    }
public:
    vector<double> medianSlidingWindow(vector<int>& nums, int k) {
        vector<double> res;
        for (int i = 0; i < (int)nums.size(); i++) {
            // Insert
            lo.insert(nums[i]);
            rebalance();
            // Balance: ensure lo's max <= hi's min
            if (!hi.empty() && *lo.rbegin() > *hi.begin()) {
                hi.insert(*lo.rbegin()); lo.erase(prev(lo.end()));
                rebalance();
            }
            // Record median after window is full
            if (i >= k - 1) {
                res.push_back(k % 2 == 1 ? *lo.rbegin() : (*lo.rbegin() + *hi.begin()) / 2.0);
                // Remove element leaving the window
                int out = nums[i - k + 1];
                if (lo.count(out)) lo.erase(lo.find(out));
                else hi.erase(hi.find(out));
                rebalance();
            }
        }
        return res;
    }
};

int main() {
    cout << "=== Unordered Set Demo ===\n";
    unordered_set_demo();

    cout << "\n=== Ordered Set Demo ===\n";
    ordered_set_demo();

    cout << "\n=== Multiset Demo ===\n";
    multiset_demo();

    cout << "\n=== Longest Consecutive Sequence ===\n";
    vector<int> nums = {100, 4, 200, 1, 3, 2};
    cout << longestConsecutive(nums) << "\n"; // 4  (1,2,3,4)

    cout << "\n=== Contains Duplicate ===\n";
    vector<int> nums2 = {1, 2, 3, 1};
    cout << containsDuplicate(nums2) << "\n"; // 1

    return 0;
}
