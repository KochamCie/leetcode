package com.hama.sword._017_合并两个有序链表;

import com.hama.common.linkedlist.SinglyLinkedList;
import com.hama.sword.BaseSolution;

/**
 * @Author: rns
 * @Date: 2018/12/15 上午10:46
 * @Description: Solution
 * 输入两个递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 */
public class Solution extends BaseSolution {

    public static SinglyLinkedList.Node merge(SinglyLinkedList.Node head1, SinglyLinkedList.Node head2) {
        if (null == head1) {
            return head2;
        }
        if (null == head2) {
            return head1;
        }

        SinglyLinkedList.Node temp = null;
        if (head1.getValue() <= head2.getValue()) {
            temp = head1;
            temp.setNext(merge(head1.getNext(), head2));
        } else {
            temp = head2;
            temp.setNext(merge(head1, head2.getNext()));
        }

        return temp;
    }


    public static void main(String[] args) {
        SinglyLinkedList linkedList2 = initLinkedList(10, 2);
        SinglyLinkedList linkedList3 = initLinkedList(10, 3);
        linkedList2.display();
        linkedList3.display();
        SinglyLinkedList.Node temp = merge(linkedList2.getHead(), linkedList3.getHead());
        while (null != temp){
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }
}
