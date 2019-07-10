/*
 * @lc app=leetcode.cn id=643 lang=java
 *
 * [643] 子数组最大平均数 I
 */
class Solution {

    public double findMaxAverage(int[] nums, int k) {
        double sum = Integer.MIN_VALUE;
        double temp = 0;
        for(int i = 0; i < k; i++) {
            temp += nums[i];
        }
        for(int i = 0; i + k <= nums.length; i++) {
            if(i != 0) {
                temp = temp - nums[i - 1] + nums[i + k - 1];
            }
            sum = Double.max(sum, temp);
        }
        return sum / k;
    }

}

