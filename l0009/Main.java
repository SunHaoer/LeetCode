package leetcode.l0009;

class Solution {
    public boolean isPalindrome(int x) {
        String str = x + "";
        for(int i = 0; i <= str.length() / 2; i++) {
        	if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        		//System.out.println(str.charAt(i) + " " + str.charAt(str.length() - 1 - i));
        		return false;
        	}
        }
        return true;
    }
}

