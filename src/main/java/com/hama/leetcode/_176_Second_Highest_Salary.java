package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/4 下午11:49
 * @Description: _176_Second_Highest_Salary
 * Write a SQL query to get the second highest salary from the Employee table.
 *
 * +----+--------+
 * | Id | Salary |
 * +----+--------+
 * | 1  | 100    |
 * | 2  | 200    |
 * | 3  | 300    |
 * +----+--------+
 * For example, given the above Employee table, the query should return 200 as the second highest salary. If there is no second highest salary, then the query should return null.
 *
 * +---------------------+
 * | SecondHighestSalary |
 * +---------------------+
 * | 200                 |
 * +---------------------+
 */
public class _176_Second_Highest_Salary {
    /**
     * # Write your MySQL query statement below
     *
     *
     *
     * select max(Salary) as SecondHighestSalary from Employee where Salary < (select max(Salary) from Employee);
     */
}
