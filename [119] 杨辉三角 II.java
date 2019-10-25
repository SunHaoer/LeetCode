import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new LinkedList<>();
        int[][] table = new int[rowIndex + 1][rowIndex + 2];
        init(table);
        action(table);
        result = getResult(table[rowIndex]);
        //print(table);
        return result;
    }

    private void init(int[][] table) {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                table[i][j] = 0;
            }
        }
        table[0][1] = 1;
    }

    private void action(int[][] table) {
        for(int i = 1; i < table.length; i++) {
            for(int j = 1; j < table[i].length; j++) {
                table[i][j] = table[i - 1][j - 1] + table[i - 1][j];
            }
        }
    }

    private List<Integer> getResult(int[]arr) {
        List<Integer> list = new LinkedList<>();
        for(int i = 1; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    private void print(int[][] table) {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// @lc code=end

