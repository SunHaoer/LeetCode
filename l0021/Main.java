package leetcode.l0021;

class ListNode { // 定义链表
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode l3 = null, now = null;		// 新表头节点l3, 当前节点now
    	if(l1 == null) {		// l1为空
    		l3 = l2;
    	} else if(l2 == null) {		// l2为空
    		l3 = l1;
    	} else {		
        	if(l1.val <= l2.val) {		// 确定头结点
        		l3 = l1;
        		now = l3;
        		l1 = l1.next;
        	} else {
        		l3 = l2;
        		now = l3;
        		l2 = l2.next;
        	} 
        	l3.next = now;		// 取出下一节点
        	while(l1 != null || l2 != null) {
        		if(l1 == null && l2 != null) {		// l1为空
        			now.next = l2;
        			break;
        		} else if(l2 == null && l1 != null) {		// l2为空
        			now.next = l1;
        			break;
        		} else {		// l1, l2非空
    		    	if(l1.val <= l2.val) {
    		    		now.next = l1;
    		    		l1 = l1.next;
    		    	} else {
    		    		now.next = l2;;
    		    		l2 = l2.next;
    		    	}
    		    	now = now.next;		// 取出下一节点   
        		}
        	}    		
    	}
    	return l3;  
    }
}

public class Main {
	
	public static void main(String[] args) {
		
	}
	
}
