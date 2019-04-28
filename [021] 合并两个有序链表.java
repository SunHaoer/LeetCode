/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode l3 = null, now = null;
    	if(l1 == null) {
    		l3 = l2;
    	} else if(l2 == null) {
    		l3 = l1;
    	} else {
        	if(l1.val <= l2.val) {
        		l3 = l1;
        		now = l3;
        		l1 = l1.next;
        	} else {
        		l3 = l2;
        		now = l3;
        		l2 = l2.next;
        	} 
        	l3.next = now;
        	while(l1 != null || l2 != null) {
        		if(l1 == null && l2 != null) {
        			now.next = l2;
        			break;
        		} else if(l2 == null && l1 != null) {
        			now.next = l1;
        			break;
        		} else {
    		    	if(l1.val <= l2.val) {
    		    		now.next = l1;
    		    		l1 = l1.next;
    		    	} else {
    		    		now.next = l2;;
    		    		l2 = l2.next;
    		    	}
    		    	now = now.next;   
        		}
        	}    		
    	}
    	return l3;  
    }
}
