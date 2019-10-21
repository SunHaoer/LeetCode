/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
            if(i >= nums.length) {
                return false;
            }
            for(int j = 1; j <= k; j++) {
                if(i + j >= nums.length) {
                    continue;
                } else if(nums[i] == nums[i + j]) {
                    return true;
                }                    
            }
        }
        return false;
    }
}
// @lc code=end

