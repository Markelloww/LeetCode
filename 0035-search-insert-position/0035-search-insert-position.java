import java.util.Arrays;

/**
 * Author: Markelloww
 * Date: 23.07.2024
 */

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            index *= -1;
            index--;
        }
        return index;
    }
}