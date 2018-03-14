package com.hama.array.PalindromeLinkedList_234;

import java.util.List;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 *
 * @author: hama
 * @date: created in  2018/3/14
 * @description:
 */
public class Solution {

    /**
     * 思路，正确的找到中间点，进而获取一半节点信息，比较另外一半
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {






        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.insert(1);
        head.insert(2);
        head.insert(3);
        head.insert(4);
        head.insert(5);
        head.insert(4);
        head.insert(3);
        head.insert(2);
        head.insert(1);
        head.display();


    }
}
