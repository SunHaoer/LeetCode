import java.util.*;

/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> resultList = new LinkedList<>();
        int len = p.length();
        int[] pArr = getInfo(p);
        for(int i = 0; i < s.length(); i++) {
            if(i + len > s.length()) {    // 遍历到了尽头
                break;
            }
            int tempArr[] = getInfo(s.substring(i, i + len));
            if(judgeArr(pArr, tempArr)) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    private int[] getInfo(String str) {
        int[] strInfoArr = new int[27];
        for(int i = 0; i < str.length(); i++) {
            strInfoArr[str.charAt(i) - 'a']++;
        }
        return strInfoArr;
    }

    private boolean judgeArr(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

