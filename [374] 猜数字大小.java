/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */

// @lc code=start
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {

    private int result = -1;

    public int guessNumber(int n) {
        judge(1, n);
        return result;
    }

    private void judge(int left, int right) {
        if(left > right) {
            return;
        }
        int num = (int)(((long)left + (long)right) / 2);
        if(guess(num) == 0) {
            result = num;
        } else if(guess(num) > 0) {
            judge(num + 1, right);
        } else if(guess(num) < 0) {
            judge(left, num);
        }
    }
}
// @lc code=end

