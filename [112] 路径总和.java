/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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

    public boolean flag = false;

    public void dfs(TreeNode node, int sum, int target) {
        sum += node.val;
        if(node.left == null && node.right == null && sum == target) {
            flag = true;
        } else {
            if(node.left != null) dfs(node.left, sum, target);
            if(node.right != null) dfs(node.right, sum, target);
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root != null) dfs(root, 0, sum);
        return flag;
    }
}

