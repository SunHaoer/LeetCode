/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) {
            return true;
        }
        boolean isUpper = Character.isUpperCase(word.charAt(1));
        if(Character.isLowerCase(word.charAt(0)) && isUpper) {
            return false;
        }
        for(int i = 1; i < word.length(); i++) {
            if(isUpper) {    // 大写
                if(Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            } else {    // 小写
                if(Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

