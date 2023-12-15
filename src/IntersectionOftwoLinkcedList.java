import org.junit.Test;
//160
public class IntersectionOftwoLinkcedList {
    @Test
    public void test(){

        ListNode k1=new ListNode(1);

        ListNode t1=new ListNode(2);
        ListNode t2=new ListNode(3);
        ListNode m1=new ListNode(4);
        k1.next=m1;
        t1.next=t2;
        t2.next=m1;

        System.out.println(intersectionOftwoLinkcedList(k1,t1).val);

        }

        public ListNode intersectionOftwoLinkcedList(ListNode k1,ListNode t1){
        if(k1==null){
            return null;
        }
         if(t1==null){
                return null;
            }
         ListNode pointer1=k1,pointer2=t1;

         while ( pointer1!= pointer2){
             pointer1= pointer1==null?t1: pointer1.next;
             pointer2= pointer2==null?k1: pointer2.next;

         }
         return pointer1;
        }


    public ListNode intersectionOftwoLinkcedList2(ListNode k1,ListNode t1){
      int L1=0,L2=0,diff=0;
      ListNode pointer1=k1;
      ListNode pointer2=t1;
      while (pointer1 !=null){
          L1++;
          pointer1=pointer1.next;
      }
        while (pointer2 !=null){
            L2++;
            pointer2=pointer2.next;
        }

        if(L1<L2){
            diff=L2-L1;
        }
        else {
            diff=L1-L2;
        }
        pointer1=k1;
        pointer2=t1;
        for (int i=0;i<diff;i++){
            pointer2=pointer2.next;
        }
        while (pointer1!=null &&pointer2!=null){
            if(pointer1==pointer2){
                return pointer1;
            }
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        return null;
    }
}
