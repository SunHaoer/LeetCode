package leetcode.l0205;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        Map<Character, Boolean> flag = new HashMap<Character, Boolean>();
        for(int i = 0; i < len; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(flag.get(ch1) == null) {
                for(int j = i + 1; j < len; j++) {
                    if(ch1 == s.charAt(j) && ch2 != t.charAt(j)) {
                        return false;
                    } else if(ch1 != s.charAt(j) && ch2 == t.charAt(j)) {
                        return false;
                    }
                }
                flag.put(ch1, true);          
            }
        }
        return true;
    }
}