/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */
class Solution {
    public String addStrings(String num1, String num2) {
        while(num1.length() < num2.length()) {
            num1 = '0' + num1;
        }
        while(num2.length() < num1.length()) {
            num2 = '0' + num2;
        }
        int len = num1.length();
        int a = 0, b = 0, c = 0;
        String resultStr = "";
        for(int i = len - 1; i >= 0; i--) {
            a = num1.charAt(i) - '0';
            b = num2.charAt(i) - '0';
            resultStr += (a + b + c) % 10;
            c = (a + b +c) / 10;
            System.out.println(resultStr);
        }
        if(c != 0) resultStr += c;
        return resultStr = new StringBuilder(resultStr).reverse().toString();
    }
}

