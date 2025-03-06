/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev = head;
        ListNode next = prev.next;

        while(next != null){
            int prevv = prev.val;
            int nextv = next.val;
            int divisor = greatest(prevv, nextv);

            ListNode divi = new ListNode(divisor);
            prev.next = divi;
            divi.next = next;
            prev = divi.next;
            next = next.next;
        }
        return head;
    }

    public int greatest(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
