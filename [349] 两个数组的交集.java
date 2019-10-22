import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {

    final private int MAX = 10010;

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        boolean[] flagArr = new boolean[MAX];
        for(int i = 0; i < nums1.length; i++) {
            flagArr[nums1[i]] = true;
        }
        for(int i = 0; i < nums2.length; i++) {
            if(flagArr[nums2[i]]) {
                set.add(nums2[i]);
            }
        }
        Integer[] temp = new Integer[set.size()];
        int[] result = new int[set.size()];
        set.toArray(temp);
        for(int i = 0; i < temp.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
// @lc code=end

