import org.junit.Test;
//1290
public class ConvertBinaryNumberinaLinkedListtoInteger {
    @Test
    public void test(){
        ListNode l3=new ListNode(1,null);
        ListNode l2=new ListNode(0,l3);
        ListNode head=new ListNode(1,l2);
        int res=getDecimalValue(head);
        System.out.println(res);

    }

    public int getDecimalValue(ListNode head) {
        int len = 0;
        int sum = 0;
        ListNode curr = head;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        len--;
        curr=head;
        while(curr!=null){
            sum += curr.val * Math.pow(2, len--);
            curr = curr.next;
        }

        return sum;
    }
}
