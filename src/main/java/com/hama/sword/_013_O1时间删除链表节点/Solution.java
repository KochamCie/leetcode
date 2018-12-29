package com.hama.sword._013_O1时间删除链表节点;

import com.hama.common.linkedlist.SinglyLinkedList;
import com.hama.sword.BaseSolution;


/**
 * @Author: rns
 * @Date: 2018/12/14 下午10:42
 * @Description: Solution
 * O(1)时间删除链表节点
 * 要知道，链表的插入时间复杂度是O(1)，查找与删除的时间复杂度是O(n)。
 * 所以要以O(1)去删除某个节点，则该节点已知。
 */
public class Solution extends BaseSolution {


    public static boolean deleteNodeO1(SinglyLinkedList myList, SinglyLinkedList.Node target){
        SinglyLinkedList.Node head = myList.getHead();

        if(null == head || null == target){
            return false;
        }

        // 目前情况，删除首尾节点需要特殊处理
        if(null == head.getNext()){
            myList.setHead(null);
            return true;
        }

        // 末节点删除需要特殊处理
        if(null == target.getNext()){
            SinglyLinkedList.Node temp = head;
            // 只能慢慢挪了。需要找到target的prev节点，那么while条件需要是两级next
            while(null!=temp.getNext().getNext()){
                temp = temp.getNext();
            }
            // 此时temp.next=target。链表中的value是能够重复的，不能以value的值进行定位
            temp.setNext(null);
            return true;
        }

        target.setValue(target.getNext().getValue());
        target.setNext(target.getNext().getNext());
        return true;

    }


    public static void main(String [] args) throws Exception {
        SinglyLinkedList linkedList = initLinkedList(1);
        linkedList.display();
        System.out.println(deleteNodeO1(linkedList, linkedList.node(0)));
        linkedList.display();
    }


}
