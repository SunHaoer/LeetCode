/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        for(int i = 0; i < len / 2; i++) {
            char a = s[i], b = s[len - 1 - i];
            s[i] = b;
            s[len - 1 - i] = a;
        }
    }
}
// @lc code=end

