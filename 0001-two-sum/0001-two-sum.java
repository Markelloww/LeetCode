import java.util.Arrays;

/**
 * Author: Markelloww
 * Date: 23.07.2024
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0)
            return new int[]{};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}