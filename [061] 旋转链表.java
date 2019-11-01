/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return head;
        }
        ListNode root = new ListNode(-1), pos = head, tailNode = null;
        root.next = head;
        int len = 0;    // 链表长度
        while(pos != null) {
            len++;
            tailNode = pos;
            pos = pos.next;
        }
        k %= len;
        if(k == 0) {
            return root.next;
        }
        int index = len - k;    // 旋转的开始节点
        pos = root.next;
        for(int i = 0; i < index - 1; i++) {
            pos = pos.next;
        }
        root.next = pos.next;
        pos.next = null;
        tailNode.next = head;
        return root.next;
    }
}
// @lc code=end

