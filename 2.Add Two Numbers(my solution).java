class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //reverse the linked lists
        ListNode newlist = new ListNode(0);
        ListNode curr=newlist;
        int head1;
        int head2;
        ArrayList<Integer> result = new ArrayList<>();
            
        head1=reverseList(l1);
        head2=reverseList(l2);
        System.out.println(head1);
        System.out.println(head2);
        //store the sum of the two number to head2
        head2=head2+head1;
        int digit=0;
        System.out.println(head2);
        //get each digit from head2
        while(head2!=0){
            digit=head2%10;
            curr.next=new ListNode(digit);
            curr=curr.next;
            head2=head2/10;
        }
        System.out.println(head2);

        if(digit==0){
            curr.next=new ListNode(0);
        }
        return newlist.next;

    }
    //reverse the linked lists and convert the linked lists to an integer
    public Integer reverseList(ListNode head) {
        ListNode prev=null;//initialize prev pointer
        ListNode current=head;//initiaalize current pointer with head
        ListNode nextNode=null;//initialize nextNode pointer
        int sum=0;
        int ten=1;
        while (current!=null){
            sum=sum+(current.val*ten);
            //Store the next node
            nextNode=current.next;
            //Reverse the link
            current.next=prev;
            //Move to the previous pointers one step forward
            prev=current;
            current=nextNode;
            ten=ten*10;
        }
        return sum;
    }
}
