import org.junit.Test;
//2016
public class MaximumDifferenceBetweenIncreasingElements {
    @Test
    public void test(){
        int[] nums={1,5,2,10};
        int res=maximumDifference(nums);
        System.out.println(res);
    }

    public int maximumDifference(int[] nums) {
        int minn=nums[0];
        int maxn=-1;
        for(int i=0;i<nums.length;i++){

            minn=Math.min(minn,nums[i]);
            if(minn<nums[i])
                maxn=Math.max(maxn,nums[i]-minn);

        }
        return maxn;
    }
}
