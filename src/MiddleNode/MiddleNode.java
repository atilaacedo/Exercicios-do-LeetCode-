package MiddleNode;

public class MiddleNode {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode copiaTemp = head;
        int aux = 0 ;
        while(copiaTemp != null){
            aux++;
            copiaTemp = copiaTemp.next;
        }
        int metade = aux/2;
        aux = 0;
        ListNode middleNode = new ListNode();
        while(head!= null){   
            if(aux > metade ){
                middleNode = middleNode.next;
                middleNode = head;
            }
            head = head.next;
             aux++;
        }

        return middleNode;
    }

}
