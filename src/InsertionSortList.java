import org.junit.Test;

public class InsertionSortList {

    @Test
    public void test(){
        ListNode head1=new ListNode(4);
        ListNode head2=new ListNode(2);
        ListNode head3=new ListNode(1);
        ListNode head4=new ListNode(3);
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;

        ListNode listNode= insertionSortList(head1);
        while (listNode!=null){
            System.out.println(listNode.val+" ");
            listNode = listNode.next;
        }
    }


    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        while (head != null) {
            ListNode prev = dummy;
            //当要进入新dummy数组的head 比prev。next 小时 直接进   大时 要把prev往下放到最后一个比head小的数上
            while (prev.next != null && prev.next.val <= head.val){
                prev = prev.next;
            }
            //到这步时 head要放到prev后面 ， 先要把prev后面的数存起来 然后再放head 再把head向后退一下更新， 然后再把之前prev后面的数加回来
            ListNode tmp = prev.next;
            prev.next = head;
            head = head.next;
            prev.next.next = tmp;
        }

        return dummy.next;
    }
}
