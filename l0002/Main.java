package leetcode.l0002;



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode result = null;
        while(l1 != null) {
        	//result.val = l1.val + l2.val;
        	result = new ListNode(l1.val + l2.val);
        	System.out.println(result.val);
        	l1 = l1.next;
        	l2 = l2.next;
        	result = result.next;
        }
        return result;
    }
}

public class Main {

	public static void main(String[] args) {

	}

}
