/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int ans = 1, result = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                ans++;
            } else {
                result = Integer.max(ans, result);
                ans = 1;
            }
        }
        result = Integer.max(ans, result);
        return result;
    }
}
// @lc code=end

