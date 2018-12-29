package com.hama.sword._015_找链表中倒数第K个节点;

import com.hama.common.linkedlist.SinglyLinkedList;
import com.hama.sword.BaseSolution;

/**
 * @Author: rns
 * @Date: 2018/12/14 下午11:31
 * @Description: Solution
 * 输入一个链表，输出该链表的倒数第k个节点
 * 扩展题：找中间节点
 */
public class Solution extends BaseSolution {

    /**
     * @param head
     * @param k
     * @return
     */
    public static SinglyLinkedList.Node findKthFromTheBottom(SinglyLinkedList.Node head, int k) {

        SinglyLinkedList.Node fast = head;
        SinglyLinkedList.Node slow = head;
        while (k > 1) {
            if (null != fast.getNext()) {
                fast = fast.getNext();
            }
            k--;
        }

        while (null != fast.getNext()){
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return slow;
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = initLinkedList(10);
        System.out.println(findKthFromTheBottom(linkedList.getHead(), 11).getValue());

    }
}
