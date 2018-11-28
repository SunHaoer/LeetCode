package leetcode.l0027;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
    	Arrays.sort(nums);
    	int last = nums.length - 1, cnt = 0;		// 最后一个元素下标, 与val相等的个数
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == val) {		// 移除
        		nums[i] = nums[last--];
        		cnt++;
        	}
        }
    	return nums.length - cnt;
    }
}

public class Main {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = new int[] {0,1,2,2,3,0,4,2};
		int val = 2;
		solution.removeElement(nums, val);
	}
	
}
