package leetcode.l0019;


class ListNode {		// 定义链表
    int val;
    ListNode next;
    ListNode(int x) { 
    	val = x; 
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode now = head;
        int cnt = 0, ans = 0;		// 节点个数, 计数
        while(now != null) {		// 统计链表节点个数
        	now = now.next;
        	cnt++;
        }
        if(cnt == n) {		// 删除表头节点
        	return head.next;
        } else {
	 	    now = head;
		    while(cnt - n - ans > 1) {		// 遍历不删除的节点
		        now = now.next;
		        ans++;
		    }
		    now.next = now.next.next;		// 跳过需要删除的节点
		    return head;             		
        }
    }
}

public class Main {
	
	public static void main(String[] args) {
		
	}

}
