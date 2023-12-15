import org.junit.Test;
//1913
import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    @Test
    public void test(){
        int[] nums={5,6,2,7,4};
        int res=maxProductDifference(nums);
        System.out.println(res);
    }

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int x=nums[0];
        int y=nums[1];
        int w=nums[nums.length-2];
        int z=nums[nums.length-1];
        int res=w*z -x*y;
        return res;
    }
}
