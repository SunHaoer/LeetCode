import java.util.Stack;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */
class Solution {

    public String reverseVowels(String s) {
        boolean[] isVowel = new boolean[256]; 
        isVowel['a'] = isVowel['e'] = isVowel['i'] = isVowel['o'] = isVowel['u'] = true;
        isVowel['A'] = isVowel['E'] = isVowel['I'] = isVowel['O'] = isVowel['U'] = true;
        StringBuilder resultStr = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel[ch]) st.push(ch);
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel[ch]) {
                resultStr.append(st.peek());
                st.pop();
            } else {
                resultStr.append(ch);
            }
        }
        return resultStr.toString();
    }
}

