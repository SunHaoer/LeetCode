import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 求众数
 */

// @lc code=start
class Solution {

    private Map<Integer, Integer> map = new HashMap<>();

    public int majorityElement(int[] nums) {
        int cnt = nums.length / 2;
        for(int num : nums) {
            map.put(num, map.get(num) == null ? 1 : map.get(num) + 1);
            if(map.get(num) > cnt) {
                return num;
            }
        }
        return 0;
    }
}
// @lc code=end

