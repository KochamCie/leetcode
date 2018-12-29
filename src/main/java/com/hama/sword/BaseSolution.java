package com.hama.sword;

import com.hama.common.linkedlist.SinglyLinkedList;

/**
 * @Author: rns
 * @Date: 2018/12/14 下午10:50
 * @Description: BaseSolution
 */
public class BaseSolution {

    public static SinglyLinkedList initLinkedList(int size) {
        return initLinkedList(size, 0);
    }


    public static SinglyLinkedList initLinkedList(int size, int step) {
        if(step<1){
            step = 1;
        }
        SinglyLinkedList linkedList = new SinglyLinkedList();
        try {
            for (int i = 1; i < size + 1; i++) {
                linkedList.addNode(i * step);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linkedList;
    }


}
