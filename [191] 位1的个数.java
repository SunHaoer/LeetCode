/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */
public class Solution {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n); 
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}