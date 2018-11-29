package leetcode.l0008;

class Solution {
    public int myAtoi(String str) {
    	String strNum = "";
    	boolean isBegin = false;
        for(int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(i);
        	if((ch == ' ' || ch == '-' || ch == '+') && "".equals(strNum) && !isBegin) {		// ' '
        		if(ch != ' ') strNum += ch;
        		continue;
        	} else if(Character.isDigit(ch)){		// 数字
        		isBegin = true;
        		if(ch != '0' || !"".equals(strNum) && !"-".equals(strNum) && !"+".equals(strNum)) {
        			strNum += ch;
        		}
        		continue;
        	} 
        	break;		// 非数字
        }
        if("".equals(strNum) || "-".equals(strNum) || "+".equals(strNum)) {
        	return 0;
        }
        System.out.println(strNum);
        if(strNum.length() > 11) {
        	if(strNum.charAt(0) == '-' ) {
        		return Integer.MIN_VALUE;
        	} else {
        		return Integer.MAX_VALUE;
        	}
        	
        } 
        long tempNum = Long.parseLong(strNum);
        if(tempNum > Integer.MAX_VALUE) {
        	return Integer.MAX_VALUE;
        }
        if(tempNum < Integer.MIN_VALUE) {
        	return Integer.MIN_VALUE;
        }
    	return (int)tempNum;
    }
}

