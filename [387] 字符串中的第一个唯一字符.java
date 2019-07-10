/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */
class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[50];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == 1) return i;
        }
        return -1;
    }
}

