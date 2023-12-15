import org.junit.Test;

import java.util.PriorityQueue;
//1005
public class MaximizeSumOfArrayAfterKNegations {
    @Test
    public void test(){
        int[] nums={2,-3,-1,5,-4};
        int k=2;
        int res=largestSumAfterKNegations(nums,k);
        System.out.println(res);
    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int n:nums){
            q.add(n);
        }
        while(k>0)
        {
            int val=q.poll();
            q.add(-val);
            k--;
        }
        int sum=0;
        while(!q.isEmpty())
        {
            sum+=q.poll();
        }
        return sum;
    }
}
