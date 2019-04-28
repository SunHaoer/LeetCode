/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 */
public class Solution {
    public string fun1(string str) {
        string temp = "";
        int n = 1;
        if(str.Length == 1) {
            temp = temp + "" + str[0] + "1";
        } else {
            for(int i = 1; i < str.Length; i++) {
                if(str[i] == str[i - 1]) {
                    n++;
                } else{
                    temp += n;
                    temp += str[i - 1];
                    
                    n = 1;
                }
            }
            temp += n;
            temp += str[str.Length - 1];   
        }
        return temp;
    }
    
    public string CountAndSay(int n) {
        string str = "1";
        for(int i = 1; i < n; i++) {
            str = fun1(str);
        }
        return str;
    }
}
