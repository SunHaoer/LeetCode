/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */
class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int ans = 0;
        k = k % len;
        int[] temp = new int[len];
        for(int i = len - k; i < len; i++) {
            temp[ans++] = nums[i];
        }
        for(int i = 0; i < len - k; i++) {
            temp[ans++] = nums[i];
        }
        for(int i = 0; i < len; i++) {
            nums[i] = temp[i];
        }
    }
}