import org.junit.Test;

import java.util.List;

public class RemoveNthNodeFromEndOfList {

    @Test
    public void test(){
//        ListNode l6=new ListNode(6,null);
//
//        ListNode l5=new ListNode(5,l6);
//
//        ListNode l4=new ListNode(4,l5);
//
//        ListNode l3=new ListNode(3,l4);
        ListNode l2=new ListNode(2,null);
        ListNode l1=new ListNode(1,l2);
        ListNode listNode=removeNthFromEnd(l1,2);

        while (listNode != null) {
            System.out.println(listNode.val + " ");
            listNode = listNode.next;
        }
    }

//fast先走n步
// slow 和 fast 都从dummy开始
    //slow.next就是要删除的点

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        for (int i = 0; i < n; i++) fast = fast.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
