import org.junit.Test;
//141
public class LinkedListCircle {
    @Test
    public void test(){
        ListNode head1=new ListNode(3);
        ListNode head2=new ListNode(2);
        ListNode head3=new ListNode(0);
        ListNode head4=new ListNode(-4);
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
//        head4.next=head2;
        System.out.println(hasCircle(head1));
    }

    public boolean hasCircle(ListNode head){
        if(head==null){
            return false;
        }
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while (fastPtr.next!=null &&fastPtr.next.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                return  true;
            }

        }
        return false;
    }
}
