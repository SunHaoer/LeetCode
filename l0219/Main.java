package leetcode.l0219;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 1; j <= k; j++) {
                if(i + j >= nums.length) {
                    continue;
                } else if(nums[i] == nums[i + j]) {
                    return true;
                }                    
            }
        }
        return false;
    }
}