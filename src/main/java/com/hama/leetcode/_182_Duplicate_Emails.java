package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午5:15
 * @Description: _182_Duplicate_Emails
 *
 * Write a SQL query to find all duplicate emails in a table named Person.
 *
 * +----+---------+
 * | Id | Email   |
 * +----+---------+
 * | 1  | a@b.com |
 * | 2  | c@d.com |
 * | 3  | a@b.com |
 * +----+---------+
 * For example, your query should return the following for the above table:
 *
 * +---------+
 * | Email   |
 * +---------+
 * | a@b.com |
 * +---------+
 */
public class _182_Duplicate_Emails {
    /**
     * # Write your MySQL query statement below
     * select Email from Person group by Email having count(Email)>1;
     */
}
