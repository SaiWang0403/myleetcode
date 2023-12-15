import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
//2395
public class FindSubarraysWithEqualSum {
    @Test
    public void test(){
        int[] nums={4,2,4};
        boolean res=findSubarrays(nums);
        System.out.println(res);
    }

    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i - 1] + nums[i];

            if (!set.add(cur)) {
                return true;
            }

        }

        return false;
    }
}
