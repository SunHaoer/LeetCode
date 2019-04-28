/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            dp[i] = (dp[i - 1] + nums[i] > nums[i]) ? (dp[i - 1] + nums[i]) : nums[i];
        }
        int maxn = Integer.MIN_VALUE;
        for(int i = 0; i < dp.length; i++) {
            if(dp[i] > maxn) maxn = dp[i];
        }
        return maxn;
    }
}

