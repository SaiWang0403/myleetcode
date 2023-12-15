import org.junit.Test;

public class MaximumProductSubarray {
    //152

    @Test
    public void test(){
        int[] nums={2,3,-2,-3};
        int res=maxProduct(nums);
        System.out.println(res);

    }

    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int preMax=nums[0];
        int preMin=nums[0];
        for(int i=1;i<nums.length;i++){
            int a=preMax *nums[i];
            int b=preMin *nums[i];
            preMax=Math.max(nums[i],Math.max(a,b));
            preMin=Math.min(nums[i],Math.min(a,b));
            ans=Math.max(ans,preMax);
        }
        return ans;
    }
}
