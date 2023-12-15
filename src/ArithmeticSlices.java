import org.junit.Test;
//413
public class ArithmeticSlices {
    @Test
    public void test(){
        int[] nums={1,2,3,4,5};
        int res=numberOfArithmeticSlices(nums);
        System.out.println(res);
    }

    public int numberOfArithmeticSlices(int[] nums) {
        var slices = 0;

        for (int i = 2, prev = 0; i < nums.length; i++)
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                prev = prev + 1;
                slices = slices + prev;
            } else {
                prev = 0;
            }

        return slices;
    }
}
