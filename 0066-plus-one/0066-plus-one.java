import java.util.ArrayList;
import java.util.List;

/**
 * Author: Markelloww
 * Date: 23.07.2024
 */

public class Solution {
    public int[] plusOne(int[] digits) {

        List<Integer> arrayList = new ArrayList<>();
        for (int digit : digits)
            arrayList.add(digit);

        int index = arrayList.size() - 1;
        while (index >= 0) {
            if (arrayList.get(index) == 9) {
                arrayList.set(index, 0);
            } else {
                arrayList.set(index, arrayList.get(index) + 1);
                break;
            }
            index--;
        }
        if (arrayList.get(0) == 0) {
            arrayList.add(0, 1);
        }

        int[] newArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++)
            newArr[i] = arrayList.get(i);
        return newArr;

    }
}
