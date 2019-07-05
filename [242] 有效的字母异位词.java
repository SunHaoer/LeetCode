/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */
class Solution {

    public int[] getArray(String str) {
        int[] array = new int[60];
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                array[ch - 'a']++;
            } else {
                array[ch - 'A' + 26]++;
            }
        }
        return array;
    }

    public boolean judge(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[60];
        int[] arr2 = new int[60];
        arr1 = getArray(s);
        arr2 = getArray(t);
        return judge(arr1, arr2);
    }
}

