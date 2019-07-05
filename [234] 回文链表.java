/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new LinkedList<Integer>();
        ListNode pointer = head;
        while(pointer != null) {
            list.add(pointer.val);
            pointer = pointer.next;
        }
        int len = list.size();
        if(len <= 1) return true;
        for(int i = 0; i <= len / 2; i++) {
            if(!list.get(i).equals(list.get(len - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}

