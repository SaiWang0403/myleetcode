import org.junit.Test;
import org.w3c.dom.ls.LSException;

//876
public class MiddleOfTheLinkedList {


    @Test
    public void test() {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
//       head4.next=head2;
        System.out.println(middleOftheLinkedList(head1).val);
    }

    public ListNode middleOftheLinkedList(ListNode k1){
        ListNode fast=k1;
        ListNode slow=k1;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return  slow;
    }
}
