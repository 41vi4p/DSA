#include <iostream>
#include <unordered_map>
#include <map>
#include <vector>
#include <algorithm>
using namespace std;

// ============================================================
// UNORDERED_MAP (Hash Map) — O(1) average all ops
// Use when: frequency count, seen-before check, Two Sum,
//           anagram grouping, caching — ORDER DOESN'T MATTER
// ============================================================
void unordered_map_demo() {
    unordered_map<string, int> mp;

    // Insert / Update
    mp["apple"] = 3;
    mp["banana"] = 5;
    mp["cherry"]++;   // auto-initializes to 0 then increments

    // Check existence BEFORE accessing (avoid ghost insertions)
    if (mp.count("apple"))          cout << mp["apple"] << "\n"; // safe
    if (mp.find("grape") != mp.end()) cout << "found\n";         // safe

    // Iterate
    for (auto& [key, val] : mp)
        cout << key << " -> " << val << "\n";

    // Erase
    mp.erase("banana");
    cout << mp.size() << "\n"; // 2
}

// ============================================================
// MAP (Ordered BST) — O(log n) all ops, sorted by key
// Use when: ordered traversal needed, floor/ceil queries,
//           range queries on keys — ORDER MATTERS
// ============================================================
void ordered_map_demo() {
    map<int, int> mp;
    mp[3] = 30;
    mp[1] = 10;
    mp[5] = 50;
    mp[2] = 20;

    // Iterates in sorted key order: 1, 2, 3, 5
    for (auto& [k, v] : mp) cout << k << " "; // 1 2 3 5
    cout << "\n";

    // Floor/Ceiling — very useful!
    auto it = mp.lower_bound(3);  // first key >= 3  →  key=3
    auto it2 = mp.upper_bound(3); // first key > 3   →  key=5

    // Largest key <= x (floor)
    int x = 4;
    auto it3 = mp.lower_bound(x);
    if (it3 != mp.begin()) {
        --it3;
        cout << "floor of " << x << " = " << it3->first << "\n"; // 3
    }

    // Smallest/Largest key
    cout << mp.begin()->first  << "\n"; // 1  (smallest)
    cout << mp.rbegin()->first << "\n"; // 5  (largest)
}

// ============================================================
// INTERVIEW PATTERNS
// ============================================================

// Pattern 1: Two Sum — O(n)
vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> seen; // value -> index
    for (int i = 0; i < (int)nums.size(); i++) {
        int comp = target - nums[i];
        if (seen.count(comp)) return {seen[comp], i};
        seen[nums[i]] = i;
    }
    return {};
}

// Pattern 2: Top K Frequent Elements — O(n log k)
vector<int> topKFrequent(vector<int>& nums, int k) {
    unordered_map<int,int> freq;
    for (int x : nums) freq[x]++;

    // Bucket sort by frequency — O(n)
    int n = nums.size();
    vector<vector<int>> bucket(n + 1);
    for (auto& [val, cnt] : freq) bucket[cnt].push_back(val);

    vector<int> res;
    for (int i = n; i >= 0 && (int)res.size() < k; i--)
        for (int v : bucket[i]) res.push_back(v);
    return res;
}

// Pattern 3: Check if two strings are anagrams
bool isAnagram(string s, string t) {
    if (s.size() != t.size()) return false;
    unordered_map<char, int> freq;
    for (char c : s) freq[c]++;
    for (char c : t) {
        if (!freq.count(c) || freq[c] == 0) return false;
        freq[c]--;
    }
    return true;
}

// Pattern 4: Subarray sum equals K (prefix sum + hashmap)
int subarraySum(vector<int>& nums, int k) {
    unordered_map<int,int> prefixCount;
    prefixCount[0] = 1; // empty prefix
    int sum = 0, count = 0;
    for (int x : nums) {
        sum += x;
        // if (sum - k) seen before, we found a subarray
        if (prefixCount.count(sum - k)) count += prefixCount[sum - k];
        prefixCount[sum]++;
    }
    return count;
}

int main() {
    cout << "=== Unordered Map Demo ===\n";
    unordered_map_demo();

    cout << "\n=== Ordered Map Demo ===\n";
    ordered_map_demo();

    cout << "\n=== Two Sum ===\n";
    vector<int> nums = {2, 7, 11, 15};
    auto res = twoSum(nums, 9);
    cout << "[" << res[0] << ", " << res[1] << "]\n"; // [0, 1]

    cout << "\n=== Is Anagram ===\n";
    cout << isAnagram("anagram", "nagaram") << "\n"; // 1

    cout << "\n=== Subarray Sum == K ===\n";
    vector<int> nums2 = {1, 1, 1};
    cout << subarraySum(nums2, 2) << "\n"; // 2

    return 0;
}
