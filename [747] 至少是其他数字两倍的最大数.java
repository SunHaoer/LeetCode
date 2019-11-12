/*
 * @lc app=leetcode.cn id=747 lang=java
 *
 * [747] 至少是其他数字两倍的最大数
 */

// @lc code=start

class Number {
    int value;
    int index;

    public Number(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

class Solution {

    private Number maxNum1 = new Number(-1, -1);
    private Number maxNum2 = new Number(-1, -1);

    public int dominantIndex(int[] nums) {
        if(nums.length < 2) {
            return 0;
        }
        for(int i = 0; i < nums.length; i++) {
            swap(nums[i], i);
        }
        if(maxNum2.value == 0 || maxNum1.value / maxNum2.value >= 2) {
            return maxNum1.index;
        }
        return -1;
    }

    private void swap(int value, int index) {
        if(value <= maxNum2.value) {
            return;
        }
        maxNum2 = new Number(value, index);
        if(maxNum2.value > maxNum1.value) {
            Number temp = maxNum1;
            maxNum1 = maxNum2;
            maxNum2 = temp;
        }
    }
}
// @lc code=end

