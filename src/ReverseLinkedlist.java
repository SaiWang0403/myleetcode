import org.junit.Test;
//206
public class ReverseLinkedlist {
    @Test
    public void test(){
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(2);
        ListNode head3=new ListNode(3);
        ListNode head4=new ListNode(4);
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;

        ListNode listNode= reverseList(head1);
        while (listNode!=null){
            System.out.println(listNode.val+" ");
            listNode = listNode.next;
        }
    }


    public ListNode reverseList(ListNode head) {

        ListNode p=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=p;
            p=head;
            head=temp;
        }
        return p;
    }
//3  2  0  -4
    public ListNode reverseLiknedlist2(ListNode k1){
            if(k1==null || k1.next==null){
                return k1;
            }
            ListNode newhead=reverseLiknedlist2(k1.next);
            //本来k1 是0~-4  执行完k1.next.next=k1; 变成0~-4 ~ 0 ~ -4 循环下去， 这时候因为newhead是-4 所以会跟着变成 -4 ~0 ~-4~ 0 循环下去
        //这样newhead就往前指了
            k1.next.next=k1;
            //要把之前的0~-4 的指向断开，要不一直循环下去 断开完 k1就不指向任何元素（就变成他自己，也不用他了） newhead会变成-4~0
            k1.next=null;
            //然后把-4~0 返回给之前reverseLiknedlist2(k1.next)， 赋值给新的newhead
            return newhead;
            //然后当时的K1会变成2 ~0  newhead是-4~0
            //变成2~0~2~0 。。。。 所以newhead会跟着变成 -4~0~2~0~2~0.。。。
        //然后把2~0 断开 newhead就剩下 -4~0~2
        //再返回 当时的K1会变成3~2  newhead -4~0~2
        //3~2~3~2  所以newhead 2 后边会接着跟3 会跟着变成 -4~0~2~3~2~3~2~3..
        //断开3-2 所以newhead会跟着变成 -4~0~2~3
    }

}
