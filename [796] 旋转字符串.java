/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()) {
            return false;
        }
        String str = A + A;
        return str.contains(B);
    }
}
// @lc code=end

