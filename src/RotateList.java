import org.junit.Test;

public class RotateList {

//61
    @Test
    public void test(){
        ListNode l5=new ListNode(5,null);

        ListNode l4=new ListNode(4,l5);

        ListNode l3=new ListNode(3,l4);
        ListNode l2=new ListNode(2,l3);
        ListNode l1=new ListNode(1,l2);
        ListNode listNode=rotateRight(l1,2);
        while (listNode != null) {
            System.out.println(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode n1 = dummy, n0 = dummy;
        int n = 0;
        while (n1.next != null) {
            n1 = n1.next;
            n++;
        }

        if (n == 0) return null;
        k %= n;
        if (k == 0) return dummy.next;
        n1 = dummy;
        for (int i = 0; i < n - k; i++) n1 = n1.next;

        n0 = n1.next;
        //因为n1 在dummy上 所以n1后面 变成null时 dummy上的n1那个位置后面就是null
        n1.next = null;
        n1 = n0;
        while (n1.next != null) n1 = n1.next;
        //因为n1在n0上 所以n1变 n0也变
        n1.next = dummy.next;
//        dummy.next = n0;
        //return n0 一样 就不用dummy.next = n0;
//        return dummy.next;
        return n0;

    }
}
