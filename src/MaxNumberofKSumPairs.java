import org.junit.Test;
//1679
import java.util.Arrays;

public class MaxNumberofKSumPairs {
    @Test
    public void test(){
        int[] nums={1,2,3,4};
        int k=5;
        int res=maxOperations(nums,k);
        System.out.println(res);
    }
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int lp = 0, rp = nums.length-1;
        while(lp < rp){
            if(nums[lp]+nums[rp] == k){
                count++;
                lp++;
                rp--;
            }else if(nums[lp]+nums[rp] > k){
                rp--;
            }else{
                lp++;
            }
        }
        return count;
    }
}
