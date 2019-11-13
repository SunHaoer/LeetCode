/*
 * @lc app=leetcode.cn id=806 lang=java
 *
 * [806] 写字符串需要的行数
 */

// @lc code=start
class Solution {

    private static final int ROW_WIDTH = 100;

    public int[] numberOfLines(int[] widths, String S) {
        int rowWidth = ROW_WIDTH, len = 1;
        for(int i = 0; i < S.length(); i++) {
            int wordWith = widths[S.charAt(i) - 'a'];
            if(rowWidth < wordWith) {
                len++;
                rowWidth = ROW_WIDTH;
            }
            rowWidth -= wordWith;
        }
        return new int[] {len, ROW_WIDTH - rowWidth};
    }
}
// @lc code=end

