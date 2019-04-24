/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */
class Solution {
    public static int MAX = 100010;
    public boolean[] flag = new boolean[MAX];
    
    public boolean isHappy(int n) {
        String str = n + "";
        int temp = 0;
        for(int i = 0; i < str.length(); i++) {
            temp += (str.charAt(i) - '0') * (str.charAt(i) - '0');
        }
        if(temp == 1) {
            return true;
        } else if(flag[temp]) {
            return false;
        } else {
            flag[temp] = true;
            return isHappy(temp);
        }
    }
}

