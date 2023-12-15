import org.junit.Test;

public class mergeTwoLists {
//21
    @Test
    public void test(){
        ListNode k1=new ListNode(1,new ListNode(2,new ListNode(6)));
        ListNode k2=new ListNode(3,new ListNode(5,new ListNode(7)));
        ListNode listNode= mergeTwolists2(k1,k2);
        while (listNode!=null){
            System.out.println(listNode.val+" ");
            listNode = listNode.next;
        }
    }

    public ListNode mergeTwolists(ListNode k1, ListNode k2){
        if(k1==null) return k2;
        if(k2==null) return k1;
        ListNode head;
        if(k1.val <= k2.val){
            head =k1;
            k1=k1.next;
        } else {
            head=k2;
            k2=k2.next;
        }
        ListNode cur =head;
        while (k1!=null && k2!=null){
            if(k1.val <= k2.val){
                cur=cur.next=k1;
                k1=k1.next;
            } else {
                cur=cur.next=k2;
                k2 =k2.next;
            }
        }
        if(k1==null){
            cur.next=k2;
        }else if (k2==null){
            cur.next=k1;
        }
        return head;
    }

    public ListNode mergeTwolists2(ListNode k1, ListNode k2){
        if(k1==null) return k2;
        if(k2==null) return k1;

        if(k1.val<=k2.val){
            k1.next=mergeTwolists2(k1.next,k2);
            return k1;
        }else {
            k2.next=mergeTwolists2(k1,k2.next);
            return k2;
        }
    }

    public ListNode mergeTwolists3(ListNode k1, ListNode k2){
        if(k1==null) return k2;
        if(k2==null) return k1;
        ListNode res=new ListNode();
        ListNode head=res;

        while (k1!=null && k2!=null){
            if(k1.val <= k2.val){
                head.next=k1;
                k1=k1.next;
            } else {
                head.next=k2;
                k2 =k2.next;
            }
            head=head.next;
        }
        if(k1==null){
            head.next=k2;
        }else if (k2==null){
            head.next=k1;
        }
        return res.next;
    }

}

