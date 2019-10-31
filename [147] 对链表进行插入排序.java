/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode preNode = root, curNode = head, node = null;
        
        while(curNode != null) {
            node = curNode.next;    // 当前插入的节点
            if(node == null || node.val > curNode.val) {
                curNode = curNode.next;
            } else {
                while(preNode.next != null && preNode.next.val < node.val) {
                    preNode = preNode.next;
                }
                ListNode tempNode = preNode.next;
                preNode.next = node;
                curNode.next = node.next;
                node.next = tempNode;
                preNode = root;
            }
        }
       return root.next;
    }
}
// @lc code=end

