package com.hama.sword._016_输出反转后的链表;

import com.hama.common.linkedlist.SinglyLinkedList;
import com.hama.sword.BaseSolution;

/**
 * @Author: rns
 * @Date: 2018/12/15 上午10:28
 * @Description: Solution
 * 输入一个链表，反转链表后，输出链表的所有元素
 * 扩展题：输出反转后链表的头节点
 */
public class Solution extends BaseSolution {

    public static SinglyLinkedList.Node reverse(SinglyLinkedList.Node head) {
        if (null == head) {
            return null;
        }
        SinglyLinkedList.Node temp = null;

        while (null != head) {
            SinglyLinkedList.Node p = head.getNext();
            head.setNext(temp);
            temp = head;
            head = p;
        }
        while (null != temp) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
        return temp;
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = initLinkedList(10);
        reverse(linkedList.getHead());
    }

}
