/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2的幂
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        String str = Integer.toBinaryString(n);
        for(int i = 0; i < str.length(); i++) {
            if(i == 0) continue;
            if(str.charAt(i) != '0') return false;
        }
        return true;
    }
}

