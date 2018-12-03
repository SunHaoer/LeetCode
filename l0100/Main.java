package leetcode.l0100;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

class Solution {
	
	public boolean isSame = true;
	
	public void judgeSame(TreeNode node1, TreeNode node2) {
		if(node1 == null && node2 == null) {
			return;
		} else if(node1 == null || node2 == null) {
			isSame = false;
			return;
		} else {
			if(node1.val != node2.val) {
				isSame = false;
				return;
			} else {
				judgeSame(node1.left, node2.left);
				judgeSame(node1.right, node2.right);
			}
		}
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		judgeSame(p, q);
		return isSame;
	}
}


