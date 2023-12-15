import org.junit.Test;

public class SwappingNodesInALinkedList {

    @Test
    public void test(){
        ListNode l5=new ListNode(5,null);

        ListNode l4=new ListNode(4,l5);

        ListNode l3=new ListNode(3,l4);
        ListNode l2=new ListNode(2,l3);
        ListNode l1=new ListNode(1,l2);
        ListNode listNode=swapNodes(l1,2);
        while (listNode != null) {
            System.out.println(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next = head;
        ListNode left = dummy, right = dummy;
        int n=0;
        while(head.next!=null){
            head=head.next;
            n++;
        }
        n=n+1;
        for (int i = 0; i < k; i++) left = left.next;
        for (int i = 0; i < n-k+1; i++) right = right.next;
        swap(left,right);
        return dummy.next;
    }
    public void swap(ListNode left, ListNode right){
        int temp=left.val;
        left.val=right.val;
        right.val=temp;
    }
}
