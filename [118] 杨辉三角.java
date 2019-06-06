import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> list = new LinkedList<Integer>();
            list.add(1);
            for(int j = 1; j < i; j++) {
                int a = result.get(i - 1).get(j - 1);
                int b = result.get(i - 1).get(j);
                list.add(a + b);
            }
            if(i != 0) list.add(1);
            result.add(list);
        }
        return result;
    }
}
