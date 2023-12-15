import org.junit.Test;

//83
public class RemoveDUplicatesFromSortmedList {
    @Test
    public void test() {
        ListNode k1 = new ListNode(1, new ListNode(1, new ListNode(6,new ListNode(6,new ListNode(7)))));
        ListNode listNode = removeDUplicatesFromSortmedList(k1);
        while (listNode != null) {
            System.out.println(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public ListNode removeDUplicatesFromSortmedList(ListNode k1) {
        if (k1 == null) {
            return k1;
        }
        ListNode currentNode=k1;
        while (null != currentNode.next) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return k1;

    }

    public ListNode removeDUplicatesFromSortmedList2(ListNode k1) {

       if(k1==null ||k1.next==null){
           return k1;
       }
       k1.next=removeDUplicatesFromSortmedList2(k1.next);
       return k1.val==k1.next.val ?k1.next :k1;

    }
}