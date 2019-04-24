/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */
class Solution {
    public boolean isPalindrome(String s) {
        for(int i = 0,j = s.length() - 1; i < j; i++, j--) {
        	while(i <= s.length() - 1 && (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)))) {
        		i++;
        	}
        	while(j >= 0 && (!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j)))) {
        		j--;
        	}
        	if(i >= j) {
        		break;
        	}
        	if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
        		return false;
        	}
        }
    	return true;
    }
}

