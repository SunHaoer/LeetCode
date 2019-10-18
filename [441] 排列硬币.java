/*
 * @lc app=leetcode.cn id=441 lang=java
 *
 * [441] 排列硬币
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        int k = 1;
        while(true) {
            if(n > k) {
                n -= k;
                k++;
            } else if(n == k) {
                return k;
            } else {
                return Integer.max(0, k - 1);
            }
        }
    }
}
// @lc code=end

