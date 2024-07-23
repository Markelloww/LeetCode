/**
 * Author: Markelloww
 * Date: 23.07.2024
 */

public class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0)
            return true;
        if (x < 0 || x % 10 == 0)
            return false;
        int palindome = 0, tmp = x;
        while (tmp != 0) {
            palindome *= 10;
            palindome += tmp % 10;
            tmp /= 10;
        }
        return palindome == x;
    }
}