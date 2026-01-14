#include <iostream>
#include <vector>
#include <unordered_map>

// TODO: Given an array of integers and a target, return indices of the two numbers such that they add up to target.
// You can assume exactly one solution exists.
// Example: nums = [2, 7, 11, 15], target = 9 -> return {0, 1} because 2 + 7 = 9
std::vector<int> twoSum(std::vector<int>& nums, int target) {
    std::unordered_map<int, int> map; // Stores number -> index

    for (int i = 0; i < nums.size(); ++i) {
        int complement = target - nums[i];

        // 1. Check if complement exists in map
        //    If yes, return { map[complement], i }

        // 2. Add current number and index to map
    }

    return {}; // Should not reach here
}

int main() {
    std::vector<int> nums = {2, 7, 11, 15};
    int target = 9;

    std::vector<int> result = twoSum(nums, target);

    if (result.size() == 2) {
        std::cout << "Indices: " << result[0] << ", " << result[1] << std::endl;
    } else {
        std::cout << "No solution found!" << std::endl;
    }

    return 0;
}
