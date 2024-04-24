// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize a dummy head node for the result linked list
        ListNode dummyHead = new ListNode(0);
        // Pointers to traverse the input linked lists and the result linked list
        ListNode p = l1, q = l2, curr = dummyHead;
        // Variable to store the carry generated during addition
        int carry = 0;
        
        // Traverse both input linked lists simultaneously
        while (p != null || q != null) {
            // Retrieve the values of the current nodes (or 0 if the node is null)
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            // Calculate the sum of the current digits and the carry
            int sum = carry + x + y;
            // Update the carry for the next iteration
            carry = sum / 10;
            // Create a new node with the sum % 10 and attach it to the result linked list
            curr.next = new ListNode(sum % 10);
            // Move the pointers to the next nodes in the input linked lists and the result linked list
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        
        // After finishing the traversal, if there is still a carry remaining, append a new node with the carry
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        
        // Return the next node of the dummy head, which is the head of the resulting linked list
        return dummyHead.next;
    }
}
