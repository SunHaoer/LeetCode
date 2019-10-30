import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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

    List<String> paths = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return paths;
    }

    private void dfs(TreeNode node, String path) {
        if(node == null) {
            return;
        }
        if(path.length() != 0) {
            path += "->";
        }
        path += node.val;
        if(node.left != null) {
            dfs(node.left, path);
        }
        if(node.right != null) {
            dfs(node.right, path);
        }
        if(node.left == null && node.right == null) {
            paths.add(path);
        }
    }
}

