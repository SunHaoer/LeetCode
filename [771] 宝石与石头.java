/*
 * @lc app=leetcode.cn id=771 lang=java
 *
 * [771] 宝石与石头
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String J, String S) {
        int ans = 0;
        for(int i = 0; i < S.length(); i++) {
            if(J.contains(S.charAt(i) + "")) {
                ans++;
            }
        }
        return ans;
    }
}
// @lc code=end

