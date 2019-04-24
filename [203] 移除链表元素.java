/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        if(node == null) {
        	return null;
        } else {
        	while(head != null && head.val == val) {
        		head = head.next;
        	}
        	node = head;
	        while(node != null && node.next != null) {
	        	if(node.next.val == val) {
	        		node.next = node.next.next;
	        	} else {
	        		node = node.next;
	        	}
	        }        	
        }
    	return head;
    }
}


