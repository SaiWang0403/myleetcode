import org.junit.Test;
//561
import java.util.Arrays;

public class ArrayPartition {
    @Test
    public void test(){
        int[] nums={1,4,3,2};
        int res=arrayPairSum(nums);
        System.out.println(res);

    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }

        return ans;
    }
}
