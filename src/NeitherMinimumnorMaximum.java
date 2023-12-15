import org.junit.Test;
//2733
import java.util.Arrays;

public class NeitherMinimumnorMaximum {
    @Test
    public void test(){
        int[] nums={3,2,1,4};
        int res=findNonMinOrMax(nums);
        System.out.println(res);
    }

    public int findNonMinOrMax(int[] nums) {

        if(nums.length<=2){
            return -1;
        }
        Arrays.sort(nums);
        return nums[1];

    }
}
