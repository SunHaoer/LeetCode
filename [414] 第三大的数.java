/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int n : nums) {
            set.add(n);
        }
        List<Integer> resultList = new ArrayList<Integer>(set);
        int len = resultList.size();
        int index = len - 1;
        if(len > 2) {
            index = len - 3;
        } 
        return resultList.get(index);
    }
}