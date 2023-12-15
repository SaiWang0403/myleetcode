import org.junit.Test;

public class PartitionList {
//86
    @Test
    public void test(){
        ListNode k1 = new ListNode(1, new ListNode(4, new ListNode(3,new ListNode(2,new ListNode(5,new ListNode(2))))));
        ListNode listNode = partition(k1,3);
        while (listNode != null) {
            System.out.println(listNode.val + " ");
            listNode = listNode.next;
        }
    }


    public ListNode partition(ListNode head, int x) {
        ListNode lh=new ListNode(0);
        ListNode l=lh;
        ListNode rh=new ListNode(0);
        ListNode r=rh;
        for(ListNode cur=head; cur!=null; cur=cur.next){
            if(cur.val<x){
                l.next=cur;
                l=l.next;
            }
            else{
                r.next=cur;
                r=r.next;
            }
        }
        l.next=rh.next;
         r.next=null;
        return lh.next;


    }
}
