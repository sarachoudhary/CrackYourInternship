class Solution {
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public int getDecimalValue(ListNode head) {
        int decimal = 0;
        int p = 0;
        ListNode head2 = reverse(head);
        while(head2 != null){
            decimal += Math.pow(2, p) * head2.val;
            head2 = head2.next;
            p++;
        }
        return decimal;
    }
}
