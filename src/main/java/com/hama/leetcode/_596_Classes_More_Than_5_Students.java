package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/1 上午11:28
 * @Description: _596_Classes_More_Than_5_Students
 *
 * There is a table courses with columns: student and class
 *
 * Please list out all classes which have more than or equal to 5 students.
 *
 * For example, the table:
 *
 * +---------+------------+
 * | student | class      |
 * +---------+------------+
 * | A       | Math       |
 * | B       | English    |
 * | C       | Math       |
 * | D       | Biology    |
 * | E       | Math       |
 * | F       | Computer   |
 * | G       | Math       |
 * | H       | Math       |
 * | I       | Math       |
 * +---------+------------+
 * Should output:
 *
 * +---------+
 * | class   |
 * +---------+
 * | Math    |
 * +---------+
 * Note:
 * The students should not be counted duplicate in each course.
 */
public class _596_Classes_More_Than_5_Students {
    /**
     *     Write your MySQL query statement below
      */

    // select class from courses group by class having count(distinct(student))>4;
}
