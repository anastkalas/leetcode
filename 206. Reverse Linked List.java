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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;//initialize prev pointer
        ListNode current=head;//initiaalize current pointer with head
        ListNode nextNode=null;//initialize nextNode pointer

        while (current!=null){
            //Store the next node
            nextNode=current.next;
            //Reverse the link
            current.next=prev;
            //Move to the previous pointers one step forward
            prev=current;
            current=nextNode;
        }
        return prev;
    }
}
