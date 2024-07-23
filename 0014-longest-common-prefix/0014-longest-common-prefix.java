/**
 * Author: Markelloww
 * Date: 23.07.2024
 */

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        StringBuilder result = new StringBuilder();
        // Найдем минимальную длину слова (т.к. префикс больше ее не может быть),
        // от которой будет зависеть кол-во итераций след. цикла for
        int minLength = strs[0].length();
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }
        for (int j = 0; j < minLength; j++) {
             char c = strs[0].charAt(j);
             boolean flag = true;
             for (int i = 0; i < strs.length; i++) {
                 if (strs[i].charAt(j) != c) {
                     flag = false;
                 }
             }
             if (!flag) {
                 break;
             }
             result.append(c);
        }
        return result.toString();
    }
}