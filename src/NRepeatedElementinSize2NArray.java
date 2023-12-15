import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
//961
public class NRepeatedElementinSize2NArray {
    @Test
    public void test(){
        int[] nums={1,2,3,3};
        int res=repeatedNTimes(nums);
        System.out.println(res);
    }

    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return 0;
    }
}
