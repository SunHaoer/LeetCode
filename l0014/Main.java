package leetcode.l0014;

class Solution {
	
	public String getShortStr(String[] strs) {		// 获取最短str(可能不唯一)
		String shortStr = "";
		int minShort = 1024;
		for(String str : strs) {
			if(str.length() < minShort) {
				shortStr = str;
				minShort = str.length();
			} else if(str.length() == minShort) {
				shortStr += "&" + str;
				minShort = str.length();
			}
		}
		return shortStr;
	}
	
	public String findPrefix(String[] strs, String tempPrefix) {		// 获取最长公共前缀
    	int index = 0;
    	for(index = 0; index < tempPrefix.length(); index++) {		// str内的每个字符
    		boolean isBreak = false;
    		for(int j = 0; j < strs.length; j++) {		// 每个str
    			if(strs[j].charAt(index) != tempPrefix.charAt(index)) {
    				isBreak = true;
    				break;
    			}
    		}
    		if(isBreak) {
    			break;
    		}
    	}
    	String prefix = strs[0].substring(0, index);
    	return prefix;
	}
	
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) {
    		return "";
    	} else if(strs.length == 1) {
    		return strs[0];
    	} else {
	    	String shortStrs[] = getShortStr(strs).split("&"); 
	    	if(shortStrs.length == 0) {
	    		return "";
	    	} else {
		    	String tempPrefix = findPrefix(shortStrs, shortStrs[0]);
		    	String prefix = findPrefix(strs, tempPrefix);
		    	return prefix;    			    		
	    	}
    	}
    }
}

