import org.junit.Test;
//1827
public class MinimumOperationstoMaketheArrayIncreasing {
    @Test
    public void test(){
        int[] nums={1,1,1};
        int res=minOperations(nums);
        System.out.println(res);
    }

    public int minOperations(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                continue;
            }
            count += nums[i - 1] - nums[i] + 1;
            nums[i] = nums[i - 1] + 1;
        }
        return count;
    }
}
