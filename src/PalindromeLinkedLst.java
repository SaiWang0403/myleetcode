//234

import org.junit.Test;

public class PalindromeLinkedLst {
    @Test
    public void test(){
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(2);
        ListNode head3=new ListNode(3);
        ListNode head4=new ListNode(2);
        ListNode head5=new ListNode(4);
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;
        System.out.println(isPalindromeLinkedLst(head1));
        }


        public boolean isPalindromeLinkedLst(ListNode k1){
            ListNode fast=k1;
            ListNode slow=k1;
            //如果是偶数个节点 就把fast放到最后一个数的后一个节点上（也就是null上），如果是奇数个节点 就把fast放到最后一个数上
            while (fast!=null &&fast.next!=null){
                   fast=fast.next.next;
                   slow=slow.next;
            }

            //如果链表时奇数个节点，把正中的归到左边
            if(fast!=null){
                slow=slow.next;
            }
            slow=reverseLiknedlist(slow);
            fast=k1;

            while (slow!=null){
                if(fast.val!=slow.val){
                    return false;
                }
                fast=fast.next;
                slow=slow.next;
            }
            return true;



    }

    public ListNode reverseLiknedlist(ListNode k1){

        ListNode pointer1=k1;
        ListNode pointer2=null;

        while (pointer1!=null){
            ListNode next=pointer1.next;
            pointer1.next=pointer2;
            pointer2=pointer1;
            pointer1=next;

        }
        return  pointer2;
    }
}
