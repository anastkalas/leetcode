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
    public ListNode mergeNodes(ListNode head) {
        //traverse the linked list
        //sum all the numbers until i meet a zero
            //var int + value of node
            //var int = 0 when meet 0
        //every time i meet 0 add the sum of the numbers in an array list
        //construct the new linked list

        ArrayList<Integer> sums = new ArrayList<>();

        ListNode curr = head.next;
        int suma = 0;

        while(curr != null){
            if(curr.val != 0){
                suma += curr.val;
            }
            else{
                if(suma != 0){
                    sums.add(suma);
                }
                suma = 0;
            }
            curr = curr.next;
        }
        ListNode dummy = new ListNode(sums.get(0));
        ListNode h = dummy;

        if(sums.size()>1){
            for(int i = 1 ; i<sums.size();i++){
                ListNode newnode = new ListNode(sums.get(i));
                h.next = newnode;
                h = h.next;
            }
        }
        return dummy;
    }
}
