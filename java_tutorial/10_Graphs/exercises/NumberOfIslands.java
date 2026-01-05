public class NumberOfIslands {

    // TODO: Count islands ('1' = land, '0' = water)
    public static int numIslands(char[][] grid) {
        int count = 0;
        
        // Loop through every cell
        // if grid[i][j] == '1', increment count and call dfs(grid, i, j)
        
        return count;
    }

    private static void dfs(char[][] grid, int r, int c) {
        // Boundary checks and water check
        
        // Mark as visited (grid[r][c] = '0')
        
        // Recurse neighbors
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        
        System.out.println("Islands: " + numIslands(grid)); // Expected: 3
    }
}
