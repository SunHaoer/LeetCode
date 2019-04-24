/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */
class Solution {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs.length > 0 ? strs[strs.length - 1].length() : 0;
    }
}

