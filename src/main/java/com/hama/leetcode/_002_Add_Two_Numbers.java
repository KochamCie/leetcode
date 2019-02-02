package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午7:21
 * @Description: _002_Add_Two_Numbers
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 *
 */
public class _002_Add_Two_Numbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int carry = 0;
//        ListNode head = new ListNode(-1);
//        ListNode temp = head;
//        while(null != l1 || null != l2){
//            int l1v = 0;
//            int l2v = 0;
//            if(null != l1){
//                l1v = l1.val;
//                l1 = l1.next;
//            }
//            if(null != l2){
//                l2v = l2.val;
//                l2 = l2.next;
//            }
//            int add = l1v + l2v + carry;
//            carry = add/10;
//            temp.next = new ListNode(add%10);
//            temp = temp.next;
//        }
//        if(1 == carry){
//            temp.next = new ListNode(1);
//        }
//        return head.next;
//    }
}
