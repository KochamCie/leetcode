package com.hama.array.PalindromeLinkedList_234;


/**
 *
 * 简单单链表实现，供习题测试
 *
 *
 * @author: hama
 * @date: created in  2018/3/14
 * @description:
 */
public class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode() {

    }

    /**
     * 添加尾节点
     *
     * @param val
     */
    public void insert(int val) {
        ListNode obj = new ListNode(val);   // 新建一个节点
        obj.next = next;  // 新建节点的next，指向上一级
        next = obj;     // 将上一级更新成新加入的节点
    }

    /**
     * 删除尾节点
     */
    public void remove() {
        if (isEmpty()) {
            return;
        }
        val = next.val;     // 值为上一级
        next = next.next;   // 指向下下
    }

    /**
     * 删除某个节点
     * @param value
     */
    public void remove(int value) {
        if (isEmpty()) {
            return;
        }
        // 如果当前正好匹配
        if (value == next.val) {
            // 只用指向下一节
            next = next.next;
        } else {
            // 如果是删掉中间的，则需要跨过删掉的节点去指向
            ListNode compare = next.next; // 比较的对象
            ListNode previous = next;     // 上一节点，当compare为删除节点时需要将此节点的next正确指向

            while(null != compare){
                if(value == compare.val){
                    // 确认删除此节点时，夸级指向
                    previous.next = compare.next;
                }
                // 挪，继续找下一位
                previous = compare;
                compare = compare.next;
            }

        }
    }


    /**
     * 查找某个节点
     * @param value
     * @return
     */
    public int find(int value){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        ListNode temp = next;
        while (null != temp){
            if(value == temp.val){
                return temp.val;
            }
            temp = temp.next;
        }
        return Integer.MIN_VALUE;
    }


    public void display() {
        if (isEmpty()) {
            return;
        }
        ListNode cur = next;
        while (cur != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println();
    }


    public boolean isEmpty() {
        if(null == next){
            System.out.println("empty");
        }
        return null == next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.insert(1);
        listNode.insert(2);
        listNode.insert(3);
        listNode.insert(4);
        listNode.insert(5);
        listNode.insert(1);
        listNode.insert(2);
        listNode.insert(3);
        listNode.insert(4);
        listNode.insert(5);
        listNode.display();
        listNode.remove();
        listNode.display();
        listNode.remove(3);
        listNode.remove(2);
        listNode.display();
        System.out.println(listNode.find(5));
        System.out.println(listNode.find(3));

    }
}
