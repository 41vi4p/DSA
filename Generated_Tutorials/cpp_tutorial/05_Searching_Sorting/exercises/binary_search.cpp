#include <iostream>
#include <vector>
#include <algorithm> // For std::sort

// TODO: Implement Binary Search Iteratively
// Returns the index of 'target' if found, else -1
int binarySearch(const std::vector<int>& arr, int target) {
    int left = 0;
    int right = arr.size() - 1;

    // while (left <= right) {
        // 1. Calculate mid
        // 2. Check if arr[mid] == target
        // 3. If target is smaller, ignore right half
        // 4. If target is greater, ignore left half
    // }
    
    return -1;
}

int main() {
    std::vector<int> nums = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    int target = 23;

    std::cout << "Searching for " << target << " in list...\n";
    int index = binarySearch(nums, target);

    if (index != -1) {
        std::cout << "Found at index: " << index << std::endl;
    } else {
        std::cout << "Not found!" << std::endl;
    }

    return 0;
}
