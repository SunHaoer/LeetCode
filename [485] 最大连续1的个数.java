/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0, result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                result = Integer.max(temp, result);
                temp = 0;
            } else {
                temp++;
            }
        }
        return Integer.max(temp, result);
    }
}
// @lc code=end

