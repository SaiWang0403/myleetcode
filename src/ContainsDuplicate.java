import org.junit.Test;

import java.util.Arrays;

public class ContainsDuplicate {
    @Test
    public void test(){
        int[] nums={1,2,3,1};
        boolean res=containsDuplicate(nums);
        System.out.println(res);
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<=nums.length-1;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
