/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        StringBuilder resultStr = new StringBuilder();
        String[] strs = s.split(" ");
        for(String str : strs) {
            if(resultStr.length() != 0) {
                resultStr.append(" ");
            }
            resultStr.append(new StringBuilder(str).reverse());
        }
        return resultStr.toString();
    }
}
// @lc code=end

