/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
    public int maxDepth = -1;
    
    public void DFS(TreeNode node, int tempDepth) {
        if(node.left != null) {     // 递归左子树
            DFS(node.left, tempDepth + 1);
        }
        if(node.right != null) {        // 递归右子树
            DFS(node.right, tempDepth + 1);
        }
        if(tempDepth > maxDepth) {      // 叶子节点
            maxDepth = tempDepth;
        }
    }
    
    public int maxDepth(TreeNode root) {
        if(root != null) {
            DFS(root, 1);
            return maxDepth;            
        } else {
            return 0;
        }
    }
}

