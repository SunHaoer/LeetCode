/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */
class Solution {
    public String addBinary(String a, String b) {
		String output = "";
		while(a.length() < b.length()) {
			a = '0' + a;
		}
		while(b.length() < a.length()) {
			b = '0' + b;
		}
		int len = a.length();
		int n = 0, n1 = 0, n2 = 0, n3 = 0;
		for(int i = len - 1; i >= 0; i--) {
			n1 = Integer.parseInt(a.charAt(i) + "");
			n2 = Integer.parseInt(b.charAt(i) + "");
			n = (n1 + n2 + n3) % 2;
			n3 = (n1 + n2 + n3) / 2;
			output += n;
		}
		if(n3 != 0) output += n3;
		return new StringBuffer(output).reverse().toString();
    }
}