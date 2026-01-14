#include <iostream>
#include <vector>
#include <queue>

int findKthLargest(std::vector<int>& nums, int k) {
    // Min-heap to store the top k largest elements
    std::priority_queue<int, std::vector<int>, std::greater<int>> minHeap;

    for (int num : nums) {
        minHeap.push(num);
        if (minHeap.size() > k) {
            minHeap.pop(); // Remove the smallest of the top k+1
        }
    }

    return minHeap.top();
}

int main() {
    std::vector<int> nums = {3, 2, 1, 5, 6, 4};
    int k = 2;

    std::cout << k << "nd largest element is: " << findKthLargest(nums, k) << std::endl;

    return 0;
}
