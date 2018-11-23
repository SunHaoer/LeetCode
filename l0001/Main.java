package leetcode.l0001;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i + 1; j < nums.length; j++) {
        		if(nums[i] + nums[j] == target) {
        			arr[0] = i;
        			arr[1] = j;
        			return arr;
        		} 
        	}
        }
        return null;
    }
}

public class Main {
	public static void main(String[] args) {
		int nums[] = {2, 7, 11, 15};
		int target = 9;
		Solution solution = new Solution();
		System.out.println(solution.twoSum(nums, target)[0] + " " + solution.twoSum(nums, target)[1]);
	}
}
