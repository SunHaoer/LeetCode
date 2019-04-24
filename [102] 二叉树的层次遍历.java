/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层次遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null) {
	        q.add(root);
	        while(!q.isEmpty()) {
	        	int size = q.size();
	        	List<Integer> temp = new ArrayList<Integer>();
	        	while(size-- > 0) {
					TreeNode now = q.peek();
					temp.add(now.val);
					q.remove();
					if (now.left != null) {
						q.add(now.left);
					}
					if (now.right != null) {
						q.add(now.right);
					}	
	        	}
	        	result.add(temp);
	        }
        }
    	return result;
    }
}

