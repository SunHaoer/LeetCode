/*
 * @lc app=leetcode.cn id=686 lang=java
 *
 * [686] 重复叠加字符串匹配
 */

// @lc code=start
class Solution {
    public int repeatedStringMatch(String A, String B) {
        if(A.equals(B) || A.contains(B)) {
            return 1;
        }
        if(!fun1(A, B)) {
            return -1;
        }
        return fun2(new StringBuilder(A), new StringBuilder(B));
    }

    private boolean fun1(String str1, String str2) {
        int[] arr1 = new int[26], arr2 = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i) - 'a']++;
        }
        for(int i =0; i < str2.length(); i++) {
            arr2[str2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 0 && arr2[i] == 0) {
                continue;
            } else if(arr1[i] == 0) {
                return false;
            }
        }
        return true;
    }

    private int fun2(StringBuilder str1, StringBuilder str2) {
        StringBuilder sourceStr = new StringBuilder(str1);
        int ans = 1;
        while(true) {
            if(str1.toString().contains(str2)) {
                return ans;
            }
            str1 = str1.append(sourceStr);
            ans++;
            if(str1.length() > str2.length() * 3 && ans > 2) {
                return -1;
            }
        }
    }

}
// @lc code=end

