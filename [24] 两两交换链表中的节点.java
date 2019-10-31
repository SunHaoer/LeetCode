/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode posNode = root;
        while(posNode != null && posNode.next != null && posNode.next.next != null) {
            ListNode node1 = posNode.next, node2 = posNode.next.next, tempNode = node2.next;
            posNode.next = node2;
            node2.next = node1;
            node1.next = tempNode;
            posNode = posNode.next.next;
        }
        return root.next;
    }
}
// @lc code=end

