import org.junit.Test;

public class LongestContiuousIncreasingSubsequence {
    //最长连续递增子序列的长度
    //这道题不是求值 而是求最大的长度
    //Input: nums = [1,3,5,4,7]
    //Output: 3
    //Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
    //Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
    //4.
    //674
    @Test
    public void test(){
        int nums[]={1,3,5,4,7};
        int res=longestContiuousIncreasingSubsequence(nums);
        System.out.println(res);
    }

    public int longestContiuousIncreasingSubsequence(int[] nums){
        if(nums.length==1){
            return 1;
        }

        int start =0;
        int max=0;
        for (int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                start=i;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}
