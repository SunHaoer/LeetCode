package leetcode.l0017;

import java.util.ArrayList;
import java.util.List;

class Solution {
	
	public String[] table = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
    public List<String> letterCombinations(String digits) {
    	List<String> result = new ArrayList<String>();
    	if(digits.length() == 0) {
    		return result;
    	} else {
    		result.add("");
	    	for(int i = 0; i < digits.length(); i++) {
	    		String str = table[digits.charAt(i) - '0'];
	    		List<String> temp = new ArrayList<String>();
	    		for(int j = 0; j < str.length(); j++) {
	    			for(int k = 0; k < result.size(); k++) {
	    				temp.add(result.get(k) + str.charAt(j));
	    			}
	    		}
	    		result = temp;
	    	}
	    	return result;    		
    	}
    }
}

