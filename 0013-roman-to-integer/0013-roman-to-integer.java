/**
 * Author: Markelloww
 * Date: 23.07.2024
 */

public class Solution {

    private int romanCharToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s) {
        int result = 0;
        boolean lastCharUsed = false;

        for (int i = 0; i < s.length() - 1; i++) {
            int current = romanCharToInt(s.charAt(i));
            int next = romanCharToInt(s.charAt(i + 1));

            if (current < next) {
                result -= current;
                if (i == s.length() - 1) {
                    lastCharUsed = true;
                }
            } else {
                result += current;
            }
        }
        if (!lastCharUsed) {
            result += romanCharToInt(s.charAt(s.length() - 1));
        }
        return result;
    }
}