package com.hama.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: rns
 * @Date: 2019/2/1 上午11:35
 * @Description: _118_Pascal_Triangle
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * <p>
 * Example:
 * <p>
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * <p>
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */
public class _118_Pascal_Triangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(0 == numRows){
            return result;
        }
        result.add(new ArrayList<Integer>(){{
            add(1);
        }});
        if(1 == numRows){
            return result;
        }

        result.add(new ArrayList<Integer>(){{
            add(1);
            add(1);
        }});

        if (2 == numRows){
            return result;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> pre = result.get(i - 1);
            for (int j = 0; j < pre.size() - 1; j++) {
                row.add(pre.get(j) + pre.get(j + 1));
            }
            result.add(row);
            row.add(1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(2));
    }
}
