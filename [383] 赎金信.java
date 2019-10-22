/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr1 = getLetterNum(ransomNote), arr2 = getLetterNum(magazine);
        return judge(arr1, arr2);
    }

    private int[] getLetterNum(String str) {
        int arr[] = new int[26];
        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        return arr;
    }

    private boolean judge(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] > arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

