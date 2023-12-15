import org.junit.Test;
//209
import java.util.Arrays;

public class MinimumSizeSubarraySum {
    @Test
    public void test(){
        int[] nums={2,3,1,2,4,3};
        int target=7;
        int res=minSubArrayLen(target,nums);
        System.out.println(res);
    }

    public int minSubArrayLen(int target, int[] nums) {

        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];

            while (windowSum >= target) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }

        return minLength != Integer.MAX_VALUE ? minLength : 0;
    }

}
