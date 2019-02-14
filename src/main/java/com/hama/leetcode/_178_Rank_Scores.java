package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/14 下午9:13
 * @Description: _178_Rank_Scores
 * Write a SQL query to rank scores. If there is a tie between two scores, both should have the same ranking. Note that after a tie, the next ranking number should be the next consecutive integer value. In other words, there should be no "holes" between ranks.
 *
 * +----+-------+
 * | Id | Score |
 * +----+-------+
 * | 1  | 3.50  |
 * | 2  | 3.65  |
 * | 3  | 4.00  |
 * | 4  | 3.85  |
 * | 5  | 4.00  |
 * | 6  | 3.65  |
 * +----+-------+
 * For example, given the above Scores table, your query should generate the following report (order by highest score):
 *
 * +-------+------+
 * | Score | Rank |
 * +-------+------+
 * | 4.00  | 1    |
 * | 4.00  | 1    |
 * | 3.85  | 2    |
 * | 3.65  | 3    |
 * | 3.65  | 3    |
 * | 3.50  | 4    |
 * +-------+------+
 */
public class _178_Rank_Scores {


    /**
     * # Write your MySQL query statement below
     * select
     *     s1.Score,
     *     (select count(distinct(s2.Score)) from Scores s2 where s2.Score>=s1.Score ) as 'Rank'
     * from
     *     Scores s1
     * order by s1.Score desc;
     */

}
