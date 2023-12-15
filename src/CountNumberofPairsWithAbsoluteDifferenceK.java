import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
//2006
public class CountNumberofPairsWithAbsoluteDifferenceK {
    @Test
    public void test(){
        int[] nums={1,2,2,1};
        int k=1;
        int res=countKDifference(nums,k);
        System.out.println(res);
    }

    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i : nums) {

            map.put(i, map.getOrDefault(i, 0) + 1);
            count += map.getOrDefault(i - k, 0) + map.getOrDefault(i + k, 0);
        }
        return count;
    }
}
