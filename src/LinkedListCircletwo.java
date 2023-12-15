import org.junit.Test;

public class LinkedListCircletwo {
//142

    @Test
    public void test() {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
       head4.next=head2;
        if(hasCircle(head1)==null){
            System.out.println(hasCircle(head1));
        }else {
            System.out.println(hasCircle(head1).val);
        }

    }

    public ListNode hasCircle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        boolean loopexist = false;
    //和   while (fastPtr!=null &&fastPtr.next != null)  效果一样 只不过 下面的写法会在如果不循环链表的时候 少循环一次while就往下跳了 例如只有1,2
        while (fastPtr.next != null && fastPtr.next.next!=null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                loopexist = true;
                break;
            }
        }
            if (loopexist) {
                slowPtr = head;
                //因为head到交点必然与此时slowptr和fastptr的交点 到 交点 距离一样
                while (slowPtr != fastPtr) {
                    slowPtr = slowPtr.next;
                    fastPtr = fastPtr.next;
                }
                return slowPtr;
            }
            return null;
        }


    }

