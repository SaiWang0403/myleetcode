import org.junit.Test;

public class RemoveDuplicatesFromSortedList2 {

    //82

    @Test
    public void test(){
        ListNode k1 = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(3,new ListNode(4,new ListNode(4,new ListNode(5)))))));
        ListNode listNode = deleteDuplicates(k1);
        while (listNode != null) {
            System.out.println(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode p=dummy;
        dummy.next = head;
        while(p.next!=null){
            ListNode q=p.next;
            while(q.next!=null && q.val==q.next.val){
                q=q.next;
            }
            if(q==p.next){
                p=p.next;
            }
            else{
                p.next=q.next;
            }
        }
        return dummy.next;
    }
}
