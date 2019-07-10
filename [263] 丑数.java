/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 */
class Solution {
    public boolean isUgly(int num) {
        if(num == 0) return false;
        int[] arr = new int[]{2, 3, 5};
        for(int i = 0; i < arr.length; i++) {
            while(num % arr[i] == 0) {
                num /= arr[i];
            }
        }
        return num == 1;
    }
}

