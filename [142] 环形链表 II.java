import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
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
    
    private Map<ListNode, Boolean> hashMap = new HashMap<>();
    
    public ListNode detectCycle(ListNode head) {
        ListNode node = head;
        while(node != null) {
            if(hashMap.get(node) != null) {
                return node;
            }
            hashMap.put(node, true);
            node = node.next;
        }
        return null;
    }
}
// @lc code=end

