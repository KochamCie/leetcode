package com.hama.common.linkedlist;

import lombok.val;

/**
 * @Author: rns
 * @Date: 2018/12/13 下午9:37
 * @Description: SinglyLinkedList
 * <p>
 * 单链表。wiki：A singly linked list whose nodes contain two fields: an integer value and a link to the next node
 * 提供常用的方法。核心方法为node(index)：定位index所在的node，有效index范围为0到链表长度。在添加、获取、删除等方法中使用
 * 具体增删方法中，对index=0的情况做特殊处理。
 */
public class SinglyLinkedList {

    private transient int size = 0;

    Node head = null;

    public Node getHead(){
        return this.head;
    }

    public void setHead(Node head){
        this.head = head;
    }

    public int size(){
        return this.size;
    }

    /**
     * node contains two fields: an integer value and a link to the next node
     */
    public static class Node {

        int value;

        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node getNext(){
            return this.next;
        }

        public int getValue(){
            return this.value;
        }

        public void setValue(int value){
            this.value = value;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public String toString() {
            System.out.println(this.value);
            return "";
        }

    }


    public SinglyLinkedList() {
    }

    /**
     * @param value
     */
    public boolean addNode(int value) throws Exception {
//        Node newNode = new Node(value);
//
//        if (null == head) {
//            head = newNode;
//            size++;
//            return;
//        }
//
//        Node temp = head;
//        while (null != temp.next) {
//            temp = temp.next;
//        }
//
//        temp.next = newNode;
//        size++;
        return add(size, value);
    }

    /**
     * @param value
     */
    public boolean addFirst(int value) throws Exception {
//        Node newNode = new Node(value);
//        Node temp = head;
//        head = newNode;
//        newNode.next = temp;
//        size++;
        return add(0, value);
    }


    public boolean remove() throws Exception {
//        if (null == head) return false;
//        Node preNode = head;
//        Node currentNode = head.next;
//        while (null != currentNode.next) {
//            preNode = currentNode;
//            currentNode = currentNode.next;
//        }
//        preNode.next = null;
//        size--;
//
        return remove(size - 1);
    }


    /**
     * 定位index所在的node，有效index范围为0到链表长度。
     *
     * @param index
     * @return
     * @throws Exception
     */
    public Node node(int index) throws Exception {

        if (index <= -1 || index >= this.size) {
            throw new Exception("index 不合法");
        }

        Node temp = head;

        int i = 0;
        while (null != temp.next) {
            if (index == i++) {
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }

    /**
     * @param index
     * @param value
     * @return
     * @throws Exception
     */
    public boolean add(int index, int value) throws Exception {
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = node(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
        return true;
    }


    /**
     * @param index
     * @return
     * @throws Exception
     */
    public int get(int index) throws Exception {
        Node current = node(index);
        return current.value;
    }

    /**
     * @param index
     * @return
     */
    public boolean remove(int index) throws Exception {
        if (index == 0) {
            head = head.next;
        } else {
            Node prev = node(index - 1);
            prev.next = prev.next.next;
        }
        size--;
        return true;
    }


    public void display() {
        System.out.println("链表长度为：" + this.size);
        if (null == head) {
            System.out.println("单链表无数据");
            return;
        }
        Node temp = head;
        while (null != temp) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        
        
        System.out.println(3&1);
        
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        linkedList1.addFirst( 5);
        linkedList1.addFirst( 4);
        linkedList1.addFirst( 2);

        SinglyLinkedList linkedList2 = new SinglyLinkedList();
        linkedList2.addFirst( 2);
        linkedList2.addFirst( 6);
        linkedList2.addFirst( 5);
        System.out.println();

        Node l1 = linkedList1.head;
        Node l2 = linkedList2.head;
        int temp = 0;
        while(null != l1){

            int add = l1.value + l2.value + temp;
            
            l1.value = add/10;
            temp = add % 10;
            l2 = l2.next;
            l1 = l1.next;
        }
        System.out.println(null == l1);
        
        while (null != l1){
            System.out.println(l1.getValue());
        }
    }
}
