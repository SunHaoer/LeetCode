/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {

    private char[] arr = new char[27];

    public String convertToTitle(int n) {
        init(arr);
        StringBuilder resultStr = new StringBuilder();
        while(n != 0) {
            char ch = '#';
            if(n % 26 != 0) {
                ch = arr[n % 26];
                n /= 26;
            } else {
                ch = 'Z';
                n = n / 26 - 1;
            }
            resultStr.append(ch);
        }
        return resultStr.reverse().toString();
    }

    private void init(char[] arr) {
        arr[0] = 'Z';
        for(int i = 1; i < arr.length; i++) {
            arr[i] = (char)('A' + i - 1);
        }
    }

}
// @lc code=end

