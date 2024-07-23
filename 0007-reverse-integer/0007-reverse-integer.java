/**
 * Author: Markelloww
 * Date: 23.07.2024
 */

public class Solution {
    public int reverse(int x) {
        int reverseNumber = 0, temp = x;
        while (temp != 0) { 
            if (reverseNumber > Integer.MAX_VALUE / 10 || reverseNumber < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reverseNumber *= 10;
            reverseNumber += temp % 10;
            temp /= 10;
        }
        return reverseNumber;
    }
}