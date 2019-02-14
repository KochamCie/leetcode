package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/14 下午10:24
 * @Description: _180_Consecutive_Numbers
 * Write a SQL query to find all numbers that appear at least three times consecutively.
 *
 * +----+-----+
 * | Id | Num |
 * +----+-----+
 * | 1  |  1  |
 * | 2  |  1  |
 * | 3  |  1  |
 * | 4  |  2  |
 * | 5  |  1  |
 * | 6  |  2  |
 * | 7  |  2  |
 * +----+-----+
 * For example, given the above Logs table, 1 is the only number that appears consecutively for at least three times.
 *
 * +-----------------+
 * | ConsecutiveNums |
 * +-----------------+
 * | 1               |
 * +-----------------+
 */
public class _180_Consecutive_Numbers {
    /**
     * # Write your MySQL query statement below
     *
     * select
     *     distinct(l1.Num) as 'ConsecutiveNums'
     * from Logs l1
     * left join Logs l2 on l2.Id = l1.Id+1
     * left join Logs l3 on l3.Id = l2.Id+1
     * where l1.Num = l2.Num and l2.Num = l3.Num;
     */
}
