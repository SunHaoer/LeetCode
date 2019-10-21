/*
 * @lc app=leetcode.cn id=463 lang=java
 *
 * [463] 岛屿的周长
 */

// @lc code=start
class Solution {
    
    int ans = 0, perimeter = 0;

    public int islandPerimeter(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    dfs(grid, i, j);
                    return perimeter;
                }
            }
        }
        return -1;
    }

    private void dfs(int[][] grid, int i, int j) {
        grid[i][j] = -2;
        if(i == 0 || grid[i - 1][j] == 0) {
            perimeter++;
        } else if(grid[i - 1][j] == 1) {
            dfs(grid, i - 1, j);
        }
        if(i == grid.length - 1 || grid[i + 1][j] == 0) {
            perimeter++;
        } else if(grid[i + 1][j] == 1) {
            dfs(grid, i + 1, j);
        }
        if(j == 0 || grid[i][j - 1] == 0) {
            perimeter++;
        } else if(grid[i][j - 1] == 1) {
            dfs(grid, i, j - 1);
        }
        if(j == grid[i].length - 1 || grid[i][j + 1] == 0) {
            perimeter++;
        } else if(grid[i][j + 1] == 1) {
            dfs(grid, i, j + 1);
        }
    }
}
// @lc code=end

