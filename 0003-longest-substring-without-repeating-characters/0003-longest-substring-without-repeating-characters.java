/*
 * @Author: Markelloww
 * Date: 24.07.2024
 */

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> visited = new HashMap<>();
        int maxLength = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currentChar = s.charAt(endIndex);

            // Если наш char уже посещен
            if (visited.containsKey(currentChar)) {
                startIndex = Math.max(startIndex, visited.get(currentChar) + 1);
            }

            maxLength = Math.max(maxLength, endIndex - startIndex + 1);

            // Помечаем char как посещенный
            visited.put(currentChar, endIndex);
        }
        return maxLength;
    }
}
