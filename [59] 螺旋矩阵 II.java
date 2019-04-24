/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */
class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1, ans = 0; 
        int[][] result = new int[n][n];
        while(num < n * n) {
            for(int i = ans; i < n - 1 - ans; i++) {
                result[ans][i] = num++;
            }
            for(int i = ans; i < n - 1 - ans; i++) {
                result[i][n - 1 - ans] = num++;
            }
           
            for(int i = n - 1 - ans; i > ans; i--) {
                result[n - 1 - ans][i] = num++;
            }
            for(int i = n - 1 - ans; i > ans; i--) {
                result[i][ans] = num++;
            }
            ans++;
        }
        if(n % 2 != 0) {
        	result[n / 2][n / 2] = n * n;
        }
        return result;
    }
}


