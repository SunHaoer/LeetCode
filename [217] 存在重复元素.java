/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */
class Solution {
    public static int MAX = 100010;
    
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> flag = new HashMap<Integer, Boolean>();
        for(int i = 0; i < nums.length; i++) {
            if(flag.get(nums[i]) == null) {
                flag.put(nums[i], true);
            } else {
                return true;
            }
        }
        return false;
    }
}