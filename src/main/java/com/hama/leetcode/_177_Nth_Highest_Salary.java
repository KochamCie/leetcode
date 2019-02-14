package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/14 下午6:00
 * @Description: _177_Nth_Highest_Salary
 * Write a SQL query to get the nth highest salary from the Employee table.
 *
 * +----+--------+
 * | Id | Salary |
 * +----+--------+
 * | 1  | 100    |
 * | 2  | 200    |
 * | 3  | 300    |
 * +----+--------+
 * For example, given the above Employee table, the nth highest salary where n = 2 is 200. If there is no nth highest salary, then the query should return null.
 *
 * +------------------------+
 * | getNthHighestSalary(2) |
 * +------------------------+
 * | 200                    |
 * +------------------------+
 */
public class _177_Nth_Highest_Salary {

    /**
     * CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
     * BEGIN
     * SET N = N-1;
     *   RETURN (
     *       # Write your MySQL query statement below.
     *       select distinct(Salary) from Employee order by Salary desc limit N,1
     *   );
     * END
     */
}