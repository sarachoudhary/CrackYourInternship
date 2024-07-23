import java.util.*;

public class proelevate {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static Node sortLinkedList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        int zero = 0;
        int one = 0;
        int two = 0;
        Node curr = head;
        while(curr != null){
            if(curr.val == 0){
                zero++;
            } else if(curr.val == 1){
                one++;
            } else {
                two++;
            }
            curr = curr.next;
        }
        curr = head;
        while(zero != 0){
            curr.val = 0;
            curr = curr.next;
            zero--;
        }
        while(one != 0){
            curr.val = 1;
            curr = curr.next;
            one--;
        }
        while(two != 0){
            curr.val = 2;
            curr = curr.next;
            two--;
        }
        return head;
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(1);
        Node newhead = sortLinkedList(head);
        while(newhead != null){
            System.out.print(newhead.val + " -> ");
            newhead = newhead.next;
        }
        System.out.print("null");
        

    }
}
