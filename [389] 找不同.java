/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */
class Solution {

    public void getArr(String str, int[] arr) {
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'a']++;
        }
    }

    public char findTheDifference(String s, String t) {
        int[] arr1 = new int[50];
        int[] arr2 = new int[50];
        getArr(s, arr1);
        getArr(t, arr2);
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) return (char)('a' + i);
        }
        return 0;
    }

}

