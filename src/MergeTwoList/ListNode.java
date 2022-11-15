package MergeTwoList;

public class ListNode {
    
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headListNode =  new ListNode(0);
        ListNode currentNode = headListNode;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                headListNode.next = list1;
                list1 = list1.next;
            }else{
                headListNode.next = list2;
                list2 = list2.next; 
            }

            headListNode = headListNode.next;
        }

        if(list1 != null){
            headListNode.next = list1;
            
        }else{
            headListNode.next = list2;
            
        }


        return currentNode.next;
    }
}
