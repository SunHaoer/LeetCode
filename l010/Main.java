package leetcode.l010;

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

public class Main {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(solution.maxArea(height));
	}
	
}
