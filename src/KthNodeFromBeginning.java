import org.junit.Test;

public class KthNodeFromBeginning {

    @Test
    public void test(){
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(2);
        ListNode head3=new ListNode(3);
        ListNode head4=new ListNode(4);
        ListNode head5=new ListNode(5);
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;
        if (kthNodeFromBeginning(head1,6)==null){
            System.out.println(kthNodeFromBeginning(head1,6));
        }
        else {
            System.out.println(kthNodeFromBeginning(head1,6).val);
        }

    }
    public ListNode kthNodeFromBeginning(ListNode k1,int kth){
        if(k1==null || kth<=0){
            return null;
        }


        ListNode pointer=k1;
        for (int count=1;count<kth;count++){
            if(pointer!=null){
                pointer=pointer.next;
            }

        }
        return pointer;
    }
}
