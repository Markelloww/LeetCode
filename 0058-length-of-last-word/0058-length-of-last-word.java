/**
 * Author: Markelloww
 * Date: 23.07.2024
 */

public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0)
            return 0;
        int counter = 0;
        int i = s.length() - 1;
        while (s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            counter++;
            i--;
        }
        return counter;
    }
}