package ReverseList;

public class ReverseLinkedListNode {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode reverseList(ListNode head) {
        ListNode reverseHead = null;
        
        while(head!= null){
            ListNode compNode = head.next;
            head.next = reverseHead;
            reverseHead = head;
            head = compNode;
        }

        return reverseHead;
    }
}
