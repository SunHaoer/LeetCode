/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */
class Solution {
    public int reverse(int x) {
        int result = 0;
        boolean flag = true;
        String str1 = x + "";
        String str2 = "";
        boolean isFirst = true;
        if(str1.charAt(0) == '-') {
        	flag = false;
        	str1 = str1.substring(1, str1.length());
        }
        for(int i = str1.length() - 1; i >= 0; i--) {
        	if(isFirst && str1.charAt(i) == '0') continue;
        	isFirst = false;
        	str2 += str1.charAt(i);
        }
        if(str2 == null || str2 == "") {
        	return 0;
        } else {
	        long temp = Long.parseLong(str2);
	        if(temp > Integer.MAX_VALUE) {
	        	result = 0;
	        } else {
	        	result = (int)temp;
	        	if(!flag) result = -result;
	        }
	        return result;        	
        }
    }
}

