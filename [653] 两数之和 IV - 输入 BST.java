import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
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

    public List<Integer> inList = new LinkedList<>();
    
    public void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        inList.add(root.val);
        inOrder(root.right);
    }

    public boolean findTarget(TreeNode root, int k) {
        inOrder(root);
        for(int i = 0; i < inList.size(); i++) {
            for(int j = i + 1; j < inList.size(); j++) {
                if(inList.get(i) + inList.get(j) == k) 
                    return true;
                if(inList.get(i) + inList.get(j) > k) 
                    break; 
            }
        }
        return false;
    }

}

