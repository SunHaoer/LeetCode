import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    private Set<ListNode> set = new HashSet<>();

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode rootA = new ListNode(-1), rootB = new ListNode(-2), posA = null, posB = null;
        rootA.next = headA;
        rootB.next = headB;
        posA = rootA.next;
        posB = rootB.next;
        while(true) {
            if(posA != null && set.contains(posA)) {
                return posA;
            }
            if(posB != null && set.contains(posB)) {
                return posB;
            }
            if(posA == posB) {
                return posA;
            }
            set.add(posA);
            set.add(posB);
            if(posA != null) {
                posA = posA.next;
            } 
            if(posB != null) {
                posB = posB.next;
            }
            if(posA == null && posB == null) {
                break;
            }
        }
        return null;
    }
}
// @lc code=end

