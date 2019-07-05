/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */
class Solution {
    public int addDigits(int num) {
        while(num >= 10) {
            String str = Integer.toString(num);
            num = 0;
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                num += (ch - '0');
            }
            str = Integer.toString(num); 
        }
        return num;
    }
}

