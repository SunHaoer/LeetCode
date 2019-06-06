/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */
class Solution {

    public static int MAX = 10010;

    public int climbStairs(int n) {
        int[] arr = new int[MAX];
        for(int i = 0; i < 3; i++) {
            arr[i] = i;
        } 
        for(int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}