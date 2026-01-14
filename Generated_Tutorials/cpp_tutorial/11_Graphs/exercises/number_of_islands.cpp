#include <iostream>
#include <vector>

// TODO: Count the number of islands.
// '1' is land, '0' is water.
// Islands are formed by connected '1's (horizontally or vertically).
// Input:
// 1 1 0 0 0
// 1 1 0 0 0
// 0 0 1 0 0
// 0 0 0 1 1
// Output: 3

void dfs(std::vector<std::vector<char>>& grid, int r, int c) {
    int rows = grid.size();
    int cols = grid[0].size();

    // 1. Check bounds and if grid[r][c] is water ('0'). If so, return.

    // 2. Mark current land as water ('0') to mark as visited.

    // 3. Recursively call dfs on 4 neighbors (up, down, left, right).
}

int numIslands(std::vector<std::vector<char>>& grid) {
    int count = 0;
    
    // 1. Loop through every cell
    //    If cell is '1' (land):
    //       Increment count
    //       Call dfs() to sink the whole island
    
    return count;
}

int main() {
    std::vector<std::vector<char>> map = {
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    };

    std::cout << "Number of Islands: " << numIslands(map) << std::endl;
    return 0;
}
