/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {

    final private int MAX = 32;

    public int fib(int N) {
        int[] fibArr = new int[MAX];
        fibArr[0] = 0;
        fibArr[1] = 1;
        if(N < 2) {
            return fibArr[N];
        }
        for(int i = 2; i < fibArr.length; i++) {
            fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
            if(i == N) {
                return fibArr[i];
            }
        }
        return 0;
    }
}
// @lc code=end

