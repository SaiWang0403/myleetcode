import org.junit.Test;

public class SwapNodesInPairs {
//24

    @Test
    public void test(){
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(2);
        ListNode head3=new ListNode(3);
        ListNode head4=new ListNode(4);

        head1.next=head2;
        head2.next=head3;
        head3.next=head4;

        ListNode res=swapPairs(head1);
        System.out.println(res.val);
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev != null)
            prev = swap(prev);


        return dummy.next;
    }

    ListNode swap(ListNode cur) {
        if (cur.next == null || cur.next.next == null) return null;
        ListNode n1 = cur.next, n2 = cur.next.next;
        n1.next = n2.next;
        //下面两行可以交换位置 因为只要N2。NEXT 还在N2 后面就行
        //不能先N2.NEXT=N1
        cur.next = n2;
        n2.next = n1;
        return n1;
    }
}
