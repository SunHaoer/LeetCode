/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public Map<ListNode, Boolean> existed = new HashMap<ListNode, Boolean>();

    public boolean hasCycle(ListNode head) {
        ListNode node = head;
        while(node != null) {
            if(existed.get(node) != null) return true;
            existed.put(node, true);
            node = node.next;
        }
        return false;
    }
}

