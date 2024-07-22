class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        } 
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int carry = 0;
        int curr = 0;
        while(head1 != null || head2 != null || carry != 0){
            curr += carry;
            if(head1 != null){
                curr += head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                curr += head2.val;
                head2 = head2.next;
            }
            carry = curr / 10;
            curr = curr % 10;
            ans.next = new ListNode(curr);
            curr = 0;
            ans = ans.next;
        }
        return dummy.next;
    }
}
