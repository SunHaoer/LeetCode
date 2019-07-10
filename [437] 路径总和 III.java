/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public int result = 0;

    public void dfs(TreeNode root, int temp, int sum) {
        if(root == null) return;
        temp += root.val;
        if(temp == sum) {
            result++;
        } 
        dfs(root.left, temp, sum);
        dfs(root.right, temp, sum);
    }

    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        dfs(root, 0, sum);            
        return result;
    }

}

