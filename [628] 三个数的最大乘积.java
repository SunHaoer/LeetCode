/*
 * @lc app=leetcode.cn id=628 lang=java
 *
 * [628] 三个数的最大乘积
 */
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len - 1] * Math.max(nums[0] * nums[1], nums[len - 2] * nums[len - 3]);
    }
}