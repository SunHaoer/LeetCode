/*
 * @lc app=leetcode.cn id=766 lang=java
 *
 * [766] 托普利茨矩阵
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length <= 1 || matrix[0].length <= 1) {
            return true;
        }
        for(int row = 0; row < matrix.length - 1; row++) {    // 左下角不用考虑
            int i = row, j = 0, target = matrix[i++][j++];
            if(!judge(matrix, i, j, target)) {
                return false;
            }
        }
        for(int col = 0; col < matrix[0].length - 1; col++) {    // 右上角不用考虑
            int i = 0, j = col, target = matrix[i++][j++];
            if(!judge(matrix, i, j, target)) {
                return false;
            }
        }
        return true;
    }

    private boolean judge(int[][] matrix, int i, int j, int target) {
        while(i < matrix.length && j < matrix[0].length) {
            if(target != matrix[i++][j++]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

