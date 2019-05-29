/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), l3 = new ListNode(0);
        head.next = l3;
        int a = 0, b = 0, c = 0;
        while(l1 != null || l2 != null) {
            if(l1 == null) a = 0;
            else a = l1.val;
            if(l2 == null) b = 0;
            else b = l2.val;
            l3.val = (a + b + c) % 10;
            c = (a + b + c) / 10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            if(l1 != null || l2 != null || c != 0) {
                l3.next = new ListNode(c);
            }
            l3 = l3.next;
        }
        return head.next;
    }
}