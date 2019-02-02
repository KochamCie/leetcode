package com.hama.leetcode;

import java.util.Stack;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午7:42
 * @Description: _155_Min_Stack
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class _155_Min_Stack {

    Stack<Integer> master = new Stack();
    Stack<Integer> slave  = new Stack();

    /** initialize your data structure here. */
    public _155_Min_Stack() {

    }

    public void push(int x) {

        int push = master.push(x);

        if(slave.empty() || x <= slave.peek()){
            slave.push(x);
        }


    }

    public void pop() {
        if(master.empty()){
            return;
        }
        int pop = master.pop();
        if(pop == slave.peek()){
            slave.pop();
        }

    }

    public int top() {

        return master.peek();
    }

    public int getMin() {
        return slave.peek();
    }
}
