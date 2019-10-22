import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 15 == 0) {
                result.add("FizzBuzz");
            } else if(i % 5 == 0) {
                result.add("Buzz");
            } else if(i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(i + "");
            }
        }
        return result;
    }
}
// @lc code=end

