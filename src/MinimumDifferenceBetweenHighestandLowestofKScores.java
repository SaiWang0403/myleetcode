import org.junit.Test;
//1984
import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
    @Test
    public void test(){
        int[] nums={9,4,1,7};
        int k=2;
        int res=minimumDifference(nums,k);
    }

    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);

        int i = 0, j = k - 1,
                min = Integer.MAX_VALUE;

        while (j < nums.length) {
            min = Math.min(min, nums[j++] - nums[i++]);
        }

        return min;
    }
}
