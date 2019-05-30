import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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

    public Map<Integer, Boolean> isExisted = new HashMap<Integer, Boolean>();

    public ListNode deleteDuplicates(ListNode head) {
        ListNode l1 = new ListNode(0);
        l1.next = head;
        int ans = 0;
        while(head != null) {
            ans++;
            isExisted.put(head.val, true);
            if(head.next == null) break;
            System.out.println(ans);
            ListNode nextNode = head.next;
            boolean notLast = true;
            while(isExisted.get(nextNode.val) != null) {
                if(nextNode.next != null) {
                    nextNode = nextNode.next;
                } else {
                    notLast = false;
                    break;
                }
            } 
            if(notLast) {
                head.next = nextNode;
                head = head.next;                
            } else {
                head.next = null;
            }

        }
        return l1.next;
    }
}