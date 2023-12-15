import org.junit.Test;
//2357
import java.util.PriorityQueue;

public class MakeArrayZerobySubtractingEqualAmounts {
    @Test
    public void test(){
        int[] nums={1,5,0,3,5};
        int res=minimumOperations(nums);
        System.out.println(res);
    }
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i :nums){
            pq.offer(i);
        }
        int temp =-1;
        int res = 0;
        for(int i =0;i<nums.length;i++){
            int polled = pq.poll();
            if(polled==0 || polled==temp){

                continue;
            }
            temp=polled;
            res++;
        }
        return res;
    }

}
