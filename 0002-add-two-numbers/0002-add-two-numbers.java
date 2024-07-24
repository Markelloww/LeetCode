/*
 * @Author: Markelloww
 * Date: 24.07.2024
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(), p = head;
        int remainder = 0;

        while (l1 != null || l2 != null) {
            int sum = remainder;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            remainder = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
        }
        if (remainder > 0) {
            p.next = new ListNode(remainder);
        }
        return head.next;
    }
}
