import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[10005];
        int len = nums.length;
        List<Integer> list = new LinkedList<Integer>();
        for(int n : nums) {
            arr[n]++;
        }
        for(int i = 1; i <= len; i++) {
            if(arr[i] > 1) list.add(i);
        }
        for(int i = 1; i <= len; i++) {
            if(arr[i] < 1) list.add(i);
        }
        int[] resultArr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            resultArr[i] = list.get(i);
        }
        return resultArr;
    }
}

