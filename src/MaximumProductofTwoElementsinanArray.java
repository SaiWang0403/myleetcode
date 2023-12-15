import org.junit.Test;
//1464
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumProductofTwoElementsinanArray {
    @Test
    public void test(){
        int[] nums={3,4,5,2};
        int res=maxProduct(nums);
        System.out.println(res);
    }

    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq  = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i :nums){
            pq.offer(i);
        }
        return (pq.poll()-1)*(pq.poll()-1);
    }
}
