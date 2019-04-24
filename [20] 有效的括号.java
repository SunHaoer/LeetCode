/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */
class Solution {
    public boolean isValid(String s) {
    	Map<Character, Character> mp = new HashMap<Character, Character>();
    	mp.put(')', '(');
    	mp.put('}', '{');
    	mp.put(']', '[');
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	if(ch == '(' || ch == '{' || ch == '[') {		// 起始括号
        		st.push(s.charAt(i));
        	} else {		// 结束的括号
        		if(st.isEmpty()) {		// st为空
        			return false;
        		} else {
        			if(st.peek() != mp.get(ch)) {		// 括号不匹配
        				return false;
        			} else {		// 匹配成功
        				st.pop();
        			}
        		}
        	}
        }
        if(st.empty()) {		// 完美
        	return true;
        } else {		// 括号未关闭
        	return false;
        }
    }
}

