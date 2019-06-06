/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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

    public int minn = 10010; 
    
    public void dfs(TreeNode node, int temp) {
        temp++;
        if(temp >= minn) return;
        if(node.left == null && node.right == null) {
            minn = temp;
        } else {
            if(node.left != null) dfs(node.left, temp);
            if(node.right != null) dfs(node.right, temp);
        }
    }
    
    public int minDepth(TreeNode root) {
        if(root != null) dfs(root, 0);
        else minn = 0;
        return minn;
    }
}
