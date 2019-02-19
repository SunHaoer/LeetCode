package leetcode.l0628;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len - 1] * Math.max(nums[0] * nums[1], nums[len - 2] * nums[len - 3]);
    }
}