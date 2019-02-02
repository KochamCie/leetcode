package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午4:26
 * @Description: _183_Customers_Who_Never_Order
 *
 * Suppose that a website contains two tables, the Customers table and the Orders table. Write a SQL query to find all customers who never order anything.
 *
 * Table: Customers.
 *
 * +----+-------+
 * | Id | Name  |
 * +----+-------+
 * | 1  | Joe   |
 * | 2  | Henry |
 * | 3  | Sam   |
 * | 4  | Max   |
 * +----+-------+
 * Table: Orders.
 *
 * +----+------------+
 * | Id | CustomerId |
 * +----+------------+
 * | 1  | 3          |
 * | 2  | 1          |
 * +----+------------+
 * Using the above tables as example, return the following:
 *
 * +-----------+
 * | Customers |
 * +-----------+
 * | Henry     |
 * | Max       |
 * +-----------+
 */
public class _183_Customers_Who_Never_Order {

    /**
     * # Write your MySQL query statement below
     */
    /**
     * select c.Name as Customers from Customers c
     * left join Orders o on o.CustomerId=c.Id
     * where o.customerId is null;
     */
}
