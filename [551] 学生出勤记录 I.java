/*
 * @lc app=leetcode.cn id=551 lang=java
 *
 * [551] 学生出勤记录 I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        int ansA = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'A') {
                ansA++;
                if(ansA > 1) {
                    return false;
                }
            } else if(ch == 'L') {
                if(i == 0 || i == s.length() - 1) {
                    continue;
                }
                if(s.charAt(i - 1) == 'L' && s.charAt(i + 1) == 'L') {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

