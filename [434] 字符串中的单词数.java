/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */
class Solution {
    public int countSegments(String s) {
        String[] strs = s.split("[\\s\\n]+");
        int result = strs.length;
        for(String str : strs) {
            if(str.isEmpty()) {
                result--;
            }
        }
        return result;
    }
}

