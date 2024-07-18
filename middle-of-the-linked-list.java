class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        curr = head;
        int key = length%2==0 ? (length/2)+1 : (length+1)/2 ;
        for(int i=1;i<key;i++){
            curr = curr.next;
        }
        return curr;
    }
}
