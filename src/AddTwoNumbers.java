import org.junit.Test;

import java.util.List;
//2
public class AddTwoNumbers {

    @Test
    public void test(){


        ListNode l3=new ListNode(3,null);
        ListNode l2=new ListNode(4,l3);
        ListNode l1=new ListNode(2,l2);


        ListNode l6=new ListNode(4,null);
        ListNode l5=new ListNode(6,l6);
        ListNode l4=new ListNode(5,l5);

        ListNode res=addTwoNumbers(l1,l4);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead =new ListNode(-1);
        ListNode cur=dummyhead;
        int temp=0;
        while (l1!=null || l2!=null || temp!=0){
            int val1=l1==null?0:l1.val;
            int val2=l2==null?0:l2.val;
            temp+=val1;
            temp+=val2;
            ListNode node=new ListNode(temp%10);
            //因为之前ListNode cur=dummyhead; 所以当cur指向新的node时候 dummyhead也会指向新的node
            cur.next=node;
            cur=cur.next;
            temp=temp/10;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return dummyhead.next;
    }
}
