import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=728 lang=java
 *
 * [728] 自除数
 */

// @lc code=start
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List resultList = new LinkedList<>();
        for(int i = left; i <= right; i++) {
            if(judge(i)) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    private boolean judge(int num) {
        int n = num;
        while(n != 0) {
            if(n % 10 == 0 || num % (n % 10) != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
// @lc code=end

