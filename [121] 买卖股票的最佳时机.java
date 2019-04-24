/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maxn = 0;
        for(int i = 0; i < prices.length; i++) {
        	int tempMaxn = -1;
            for(int j = i + 1; j < prices.length; j++) {        // 找出index后的最大值
                tempMaxn = Math.max(tempMaxn, prices[j]); 
            }
            if(tempMaxn < prices[i]) {      // 不买
                continue;
            } else {
                if(maxn < tempMaxn - prices[i]) {       // 买
                    maxn = tempMaxn - prices[i];
                }
            }
        }
        return maxn;
    }
}
