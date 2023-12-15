import org.junit.Test;
//1800
public class MaximumAscendingSubarraySum {
    @Test
    public void test(){
        int[] nums={6,10,6};
        int res=maxAscendingSum(nums);
        System.out.println(res);
    }

    public int maxAscendingSum(int[] nums) {
        int temp=nums[0];
        int max=temp;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                temp+=nums[i];
                max=Math.max(max,temp);
            }else{
                temp=nums[i];
            }
        }
        return max;
    }
}
