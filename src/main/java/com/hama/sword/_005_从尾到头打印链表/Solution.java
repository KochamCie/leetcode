package com.hama.sword._005_从尾到头打印链表;

import com.hama.common.linkedlist.SinglyLinkedList;
import com.hama.sword._002_单例设计模式.Singleton_db_check;

import java.util.Stack;

/**
 * @Author: rns
 * @Date: 2018/12/13 下午5:22
 * @Description: Solution
 * 输入一个链表，从尾到头打印链表的每个节点的值。
 * 借助Stack，循环入栈再出栈，就是倒序了
 */
public class Solution {

    public static void displayTail2Head(SinglyLinkedList myList) throws Exception {
        if (null == myList) {
            return;
        }
        SinglyLinkedList.Node head = myList.getHead();
        Stack<Integer> stack = new Stack<>();
        while (null != head) {
            stack.push(head.getValue());
            head = head.getNext();
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void displayTail2Head2(SinglyLinkedList.Node head) throws Exception {
        if(null != head){
            if(null != head.getNext()){
                displayTail2Head2(head.getNext());
            }
            System.out.println(head.getValue());
        }
    }


    public static void main(String[] args) throws Exception {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.addNode(1);
        myList.addNode(2);
        myList.addNode(3);
        myList.addNode(4);
        myList.addNode(5);
        myList.addNode(6);
        myList.addNode(7);
        displayTail2Head(myList);
        System.out.println();
        displayTail2Head2(myList.getHead());
    }

}
