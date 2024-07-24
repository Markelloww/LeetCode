/*
 * @Author: Markelloww
 * Date: 24.07.2024
 */

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, j = 0;
        int[] merged = new int[m + n];

        for (int i = 0; i < m; i++, j++)
            merged[j] = nums1[i];
        for (int i = 0; i < n; i++, j++)
            merged[j] = nums2[i];
        Arrays.sort(merged);

        if (merged.length % 2 != 0)
            return (double) merged[merged.length / 2];
        return ((double) merged[merged.length / 2] + (double) merged[merged.length / 2 - 1]) / 2.0;
    }
}
