package leetcode.l0026;

class Solution {
	
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ) {
            return 0;
        } else {
            int index = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[index] != nums[i]) {
                    nums[++index] = nums[i];
                } 
            }
            return index + 1;
        }
    }
    
}

