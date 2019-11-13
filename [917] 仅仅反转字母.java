/*
 * @lc app=leetcode.cn id=917 lang=java
 *
 * [917] 仅仅反转字母
 */

// @lc code=start
class Solution {
    public String reverseOnlyLetters(String S) {
        String resultStr = "", letterStr = "";
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(Character.isLetter(ch)) {
                letterStr += ch;
                resultStr += '￥';
            } else {
                resultStr += ch;
            }
        }
        int pos = letterStr.length() - 1;
        for(int i = 0; i < resultStr.length(); i++) {
            if('￥' == resultStr.charAt(i)) {
                String tempStr = "";
                if(i != 0) {
                    tempStr = resultStr.substring(0, i);
                }
                tempStr += letterStr.charAt(pos--);
                if(i != resultStr.length() - 1) {
                    tempStr += resultStr.substring(i + 1);
                }
                resultStr = tempStr;
            }
        }
        return resultStr;
    }
}
// @lc code=end

