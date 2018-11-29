package leetcode.l0101;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}
 
class Solution {
    
    public String orderStr1 = "", orderStr2 = "";
    public String orderStr3 = "", orderStr4 = "";
    
    public void order1(TreeNode node) {     // 左中右
        if(node.left != null) {
            order1(node.left);
        }
        orderStr1 += node.val;
        if(node.right != null) {
            order1(node.right);
        }
    }
    
    public void order2(TreeNode node) {        // 右中左
        if(node.right != null) {
            order2(node.right);
        }
        orderStr2 += node.val;
        if(node.left != null) {
            order2(node.left);
        }
    }
    
    public void order3(TreeNode node) {     // 中左右
        orderStr3 += node.val;
        if(node.left != null) {
            order3(node.left);
        }
        if(node.right != null) {
            order3(node.right);
        }
    }
    
    public void order4(TreeNode node) {        // 中右左
        orderStr4 += node.val;
        if(node.right != null) {
            order4(node.right);
        }
        if(node.left != null) {
            order4(node.left);
        }
    }
    
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
           return  true;
        } else {
            order1(root);
            order2(root);
            order3(root);
            order4(root);
            if(orderStr1.equals(orderStr2) && orderStr3.equals(orderStr4)) {
                return true;
            } else {
                return false;
            }            
        }
    }
}

