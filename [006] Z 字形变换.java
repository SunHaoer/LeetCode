/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        StringBuilder resultStr = new StringBuilder("");
        int len = s.length();
        if(len <= 1 || numRows <= 1) {
            return s;
        }
        int rowNum = numRows, colNum = len / (2 * numRows - 2) * (numRows - 1);
        if(len % (2 * numRows - 2) != 0) {
            if(len % (2 * numRows - 2) <= numRows) {
                colNum++;
            } else {
                colNum = (colNum + 1) + (len % (2 * numRows - 2) - numRows);
            }
        }
        char[][] table = new char[colNum][rowNum];
        int ans = 0;
        for(int i = 0; i < colNum; i++) {
            if(i % (rowNum - 1) == 0) {    // 逆序
                for(int j = rowNum - 1; j >= 0; j--) {
                    if(ans < len) {
                        table[i][j] = s.charAt(ans++);
                    } else {
                        table[i][j] = '-';
                    }
                }
            } else {    // 顺序
                for(int j = 0; j < rowNum; j++) {
                    if(i % (rowNum - 1) == j && ans < len) {
                        table[i][j] = s.charAt(ans++);
                    } else {
                        table[i][j] = '-';
                    }
                }
            }
        }
        for(int i = rowNum - 1; i >= 0; i--) {
            for(int j = 0; j < colNum; j++) {
                if(table[j][i] != '-') {
                    resultStr.append(table[j][i]);
                }
            }
        }
        return resultStr.toString();
    }
}
// @lc code=end

