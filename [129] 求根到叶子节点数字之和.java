/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根到叶子节点数字之和
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
    
    public void DFS(TreeNode node, int num) {
        if(node != null) {
            num = num * 10 + node.val;
            if(node.left != null) {
                DFS(node.left, num);
            }
            if(node.right != null) {
                DFS(node.right, num);
            }
            if(node.left == null && node.right == null) {
                result += num;
            }
        }
    }
    
    public int sumNumbers(TreeNode root) {
        DFS(root, 0);
        return result;
    }
}

