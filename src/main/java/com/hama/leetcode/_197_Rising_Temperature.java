package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午5:03
 * @Description: _197_Rising_Temperature
 * Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.
 *
 * +---------+------------------+------------------+
 * | Id(INT) | RecordDate(DATE) | Temperature(INT) |
 * +---------+------------------+------------------+
 * |       1 |       2015-01-01 |               10 |
 * |       2 |       2015-01-02 |               25 |
 * |       3 |       2015-01-03 |               20 |
 * |       4 |       2015-01-04 |               30 |
 * +---------+------------------+------------------+
 * For example, return the following Ids for the above Weather table:
 *
 * +----+
 * | Id |
 * +----+
 * |  2 |
 * |  4 |
 * +----+
 */
public class _197_Rising_Temperature {

    /**
     * # Write your MySQL query statement below
     *
     */
    /**
     * select w.Id from Weather w, Weather m
     * where TO_DAYS(w.RecordDate)-TO_DAYS(m.RecordDate) = 1
     * and w.Temperature>m.Temperature
     */
}
