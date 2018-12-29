package com.hama.common.tree;

/**
 * @Author: rns
 * @Date: 2018/12/20 下午3:23
 * @Description: BinaryTree
 *
 * 二叉树
 *
 */
public class BinaryTree {

    private Node root;


    /**
     *
     * @param val
     * @return
     */
    public Node get(int val){
        Node current = root;
        while(current != null){
            if(val < current.value){
                current = current.left; // 左子树
            }else if(val > current.value){
                current = current.right;    // 右子树
            }else{
                return current;
            }
        }
        return null;
    }


    /**
     *
     * @param val
     * @return
     */
    public boolean add(int val){

        Node newNode = new Node(val);

        if(null == root){
            root = newNode;
            return true;
        }

        Node current = root;
        while(null != current){

            if(val < current.value){
                if(null == current.left){
                    current.left = newNode;
                    return true;
                }
                current = current.left;
            } else {

                if(null == current.right){
                    current.right = newNode;
                    return true;
                }
                current = current.right;
            }
        }
        return false;
    }


    /**
     * 前序遍历
     * root-left-right
     */
    public void preOrder(Node current){
        if(null != current){
            System.out.println(current.value);
            preOrder(current.left);
            preOrder(current.right);
        }
    }

    /**
     * 中序遍历
     * left-root-right
     * @param current
     */
    public void inOrder(Node current){
        if(null != current){
            preOrder(current.left);
            System.out.println(current.value);
            preOrder(current.right);
        }
    }

    /**
     * 后续遍历
     * left-right-root
     * @param current
     */
    public void postOrder(Node current){
        if(null != current){
            preOrder(current.left);
            preOrder(current.right);
            System.out.println(current.value);
        }
    }

    /**
     * 查找最大的树节点
     * 使劲往右边找
     * @return
     */
    public Node findMax(){
        Node current = root;
        while (null != current.right){
            current = current.right;
        }
        return current;
    }

    /**
     * 查找最小的树节点
     * 使劲往左边找
     * @return
     */
    public Node findMin(){
        Node current = root;
        while (null != current.left){
            current = current.left;
        }
        return current;
    }

    /**
     *
     * 删除某个节点
     *
     * @return
     */
    public boolean delete(int val){

        // 定位到要删除的节点
        // 删除的是n0节点
        // 删除的是n1节点
        // 删除的是n2节点




        return false;
    }

    public static class Node {

        int value;

        Node left;

        Node right;

        public Node(int val) {
            this.value = val;
        }
    }


    public static void main(String [] args){
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.add(5));
        System.out.println(tree.add(2));
        System.out.println(tree.add(7));
        System.out.println(tree.add(4));
        System.out.println(tree.add(8));
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
        System.out.println(tree.findMax().value);
        System.out.println(tree.findMin().value);
    }
}
