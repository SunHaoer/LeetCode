import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new LinkedList<Integer>();
        boolean isEnd = false;
        for(int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for(int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int ans = 0;
        for(int e : list) {
            nums1[ans++] = e;
        }
    }
}
