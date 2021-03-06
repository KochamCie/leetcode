package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/4 下午10:12
 * @Description: _836_Rectangle_Overlap
 * <p>
 * A rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) are the coordinates of its bottom-left corner, and (x2, y2) are the coordinates of its top-right corner.
 * <p>
 * Two rectangles overlap if the area of their intersection is positive.  To be clear, two rectangles that only touch at the corner or edges do not overlap.
 * <p>
 * Given two (axis-aligned) rectangles, return whether they overlap.
 * <p>
 * Example 1:
 * <p>
 * Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
 * Output: true
 * Example 2:
 * <p>
 * Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
 * Output: false
 * Notes:
 * <p>
 * Both rectangles rec1 and rec2 are lists of 4 integers.
 * All coordinates in rectangles will be between -10^9 and 10^9.
 */
public class _836_Rectangle_Overlap {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], x11 = rec2[0];
        int x2 = rec1[2], x22 = rec2[2];
        int y1 = rec1[1], y11 = rec2[1];
        int y2 = rec1[3], y22 = rec2[3];
        return x1 < x22 && x11 < x2 && y1 < y22 && y11 < y2;
    }

}
