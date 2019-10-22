/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {

    private boolean canSkip = true, flag = false;

    public boolean validPalindrome(String s) {
        boolean canSkip = true;
        int len = s.length();
        judge(s, 0, len - 1);
        return flag;
    }

    private void judge(String s, int a, int b) {
        for(int i = a, j = b; j > i; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                if(!canSkip) {
                    return;
                }
                if(s.charAt(i + 1) == s.charAt(j)) {
                    canSkip = false;
                    judge(s, i + 1, j);
                }
                if(s.charAt(i) == s.charAt(j - 1)) {
                    canSkip = false;
                    judge(s, i, j - 1);
                }
                return;
            }
        }
        flag = true;
    }
}
// @lc code=end

