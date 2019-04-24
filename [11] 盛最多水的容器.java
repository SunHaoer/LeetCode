/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */
class Solution {
	public int min(int height1, int height2) {		// 取最小值
		if(height1 <= height2) {
			return height1;
		} else {
			return height2;
		}
	}
	
    public int maxArea(int[] height) {
        int maxValue = 0;
        for(int i = 0; i < height.length; i++) {
        	for(int j = i + 1; j < height.length; j++) {
        		int heigh = min(height[i], height[j]);		// 高度
        		int width = j - i;		// 宽度
        		if(heigh * width > maxValue) {
        			maxValue = heigh * width;
        		}
        	}
        }
    	return maxValue;
    }
}
