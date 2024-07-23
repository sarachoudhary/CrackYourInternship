class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode next = curr.next;
        while(next != null){
            if(curr.val == next.val){
                curr.next = curr.next.next;
                next = curr.next;
            } else {
                curr = next;
                next = curr.next;
            }
        }
        return head;
    }
}
