import org.junit.Test;

public class MaximunAverageSubarray1 {
    //643

    @Test
    public void test(){
        int[] nums={1,12,-5,-6,50,3};
        double res=maximunAverageSubarray(nums,4);
        System.out.println(res);
    }

    public double maximunAverageSubarray(int[] nums,int k){
        int sum=0;
        int n=nums.length;

        for (int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        for (int i=k;i<n;i++){
            sum=sum-nums[i-k] +nums[i];
            max=Math.max(sum,max);
        }
        return 1.0 * max/k;
    }

}
