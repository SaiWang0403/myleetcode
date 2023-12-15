import org.junit.Test;

public class KthNodeFromEnd {

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
        if (kthNodeFromEnd(head1,2)==null){
            System.out.println(kthNodeFromEnd(head1,2));
        }
        else {
            System.out.println(kthNodeFromEnd(head1,2).val);
        }

    }


    public ListNode kthNodeFromEnd(ListNode k1,int kth){
        if(k1==null || kth<=0){
            return null;
        }

        ListNode fast=k1;
        ListNode slow=null;

       for (int count=1;count<kth;count++){
           if(fast!=null){
               fast=fast.next;
           }
           else {
               break;
           }
       }

       while (fast!=null &&fast.next!=null){
           if(slow==null){
               slow=k1;
           }
           else {
               fast=fast.next;
               slow=slow.next;
           }
       }
       if(slow!=null){
           return slow;

       }

       return null;
    }
}
