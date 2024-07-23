 class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        
        while(curr.next != null){
            if(curr.val == val){
                if(next == null){
                    prev.next = null;
                    break;
                } else  {
                    prev.next = next;
                    curr = prev.next;
                    next = curr.next;
                }
            } else {
                prev = curr;
                curr = next;
                next = curr.next;
            }
        } 
        if(curr.val == val){
            prev.next = null;
        }
        return head;
    }
}
