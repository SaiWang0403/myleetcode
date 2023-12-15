import org.junit.Test;
//53
//https://www.bilibili.com/video/BV1eg411w7gn?p=64&vd_source=617abaa90bad62ce2d53b4924dbe6aed
public class MaximumSubarray {
    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: [4,-1,2,1] has the largest sum = 6.
    @Test
    public void test(){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(arr));

    }

    public int maxSubArray(int[] nums) {
            int[] dp =new int[nums.length];
            int result=nums[0];
            //包括下标i之前的最大的 连续子序列和
            //dp[i]就是 i（必须包括i这个位置的数字,因为要连续） 之前的所有数字的最大的 连续子序列和
        //从I=1开始算 因为I=0的时候就一个数 ， 所以 所有数字的最大连续子序列和  就是那一个数
            for (int i=1;i<nums.length;i++){
                dp[i]=Math.max(nums[i]+dp[i-1],nums[i] );
                if(result<dp[i]){
                    result=dp[i];
                }
            }
            return result;

    }
//因为 dp数组 其实只用到了 当前i的数字 和i-1 的数字 ，和别的数字无关， 所以完全可以不需要dp数组
    //-2 1 3 -5

    // -2 3 -5 1 1000
    public int maxSubArray2(int[] nums) {
       int res=nums[0];
       //curMaxSubstringValue 就是到i这个点时 最大的连续子序列的值 （必须包括当前的i这个点的值）
        //curMaxSubstringValue 有两种可能（一种是加之前的点的curMaxSubstringValue值，一种是不加 就要新点自己（因为会有负数情况 如果没负数就肯定是从头加到尾了）） 有可能是之前的最大的连续子序列的值加上这个i 这个新的点的值 要不就仅仅是i这个新点他自己的值（如果是 就从i这个新点重新开始）
       int curMaxSubstringValue=res;
       for (int i=1; i<nums.length;i++){
           curMaxSubstringValue=Math.max(curMaxSubstringValue+nums[i],nums[i]);
           if(res<curMaxSubstringValue){
               res=curMaxSubstringValue;
           }
       }
       return res;

    }
}
