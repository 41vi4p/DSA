#include <iostream>
#include <vector>

int binarySearch(const std::vector<int>& arr, int target) {
    int left = 0;
    int right = arr.size() - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] < target)
            left = mid + 1;
        else
            right = mid - 1;
    }

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
