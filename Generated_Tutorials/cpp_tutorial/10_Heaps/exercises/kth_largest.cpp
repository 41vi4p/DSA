#include <iostream>
#include <vector>
#include <queue>

// TODO: Find the K-th largest element in an array
// Example: [3, 2, 1, 5, 6, 4], k = 2 -> Output: 5 (6 is 1st largest, 5 is 2nd)
int findKthLargest(std::vector<int>& nums, int k) {
    // Hint: Use a Min-Heap (priority_queue with std::greater) of size k.
    // Keep adding elements. If size > k, pop the smallest.
    // The top of the heap will eventually hold the K-th largest.
    
    // std::priority_queue<int, std::vector<int>, std::greater<int>> minHeap;

    return 0; // Replace
}

int main() {
    std::vector<int> nums = {3, 2, 1, 5, 6, 4};
    int k = 2;

    std::cout << k << "nd largest element is: " << findKthLargest(nums, k) << std::endl;

    return 0;
}
