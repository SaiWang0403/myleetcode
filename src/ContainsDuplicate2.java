import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
//219
public class ContainsDuplicate2 {

    @Test
    public void test(){
        int[] nums={1,0,1,1};
        boolean res=containsNearbyDuplicate(nums,1);
        System.out.println(res);
    }


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        final Map<Integer, Integer> occurences = new HashMap<>();
        for (int ind = 0; ind < nums.length; ind++) {
            if (occurences.containsKey(nums[ind])) {
                final int prev = occurences.get(nums[ind]);
                if (ind - prev <= k) {
                    return true;
                }
            }
            occurences.put(nums[ind], ind);
        }
        return false;
    }
}
