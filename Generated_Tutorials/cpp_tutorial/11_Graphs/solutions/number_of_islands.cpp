#include <iostream>
#include <vector>

void dfs(std::vector<std::vector<char>>& grid, int r, int c) {
    int rows = grid.size();
    int cols = grid[0].size();

    if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
        return;
    }

    grid[r][c] = '0'; // Mark as visited

    dfs(grid, r + 1, c);
    dfs(grid, r - 1, c);
    dfs(grid, r, c + 1);
    dfs(grid, r, c - 1);
}

int numIslands(std::vector<std::vector<char>>& grid) {
    int count = 0;
    for (int i = 0; i < grid.size(); i++) {
        for (int j = 0; j < grid[0].size(); j++) {
            if (grid[i][j] == '1') {
                count++;
                dfs(grid, i, j);
            }
        }
    }
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
