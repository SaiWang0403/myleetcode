import org.junit.Test;
//747
public class LargestNumberAtLeastTwiceofOthers {
    @Test
    public void test(){
        int[] nums={3,6,1,0};
        int res=dominantIndex(nums);
        System.out.println(res);
    }


    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = Math.max(i,max);
        }
        int pos = 0;
        for(int x = 0; x < nums.length; x++){
            if (nums[x] == max) {
                pos = x;
            }
            int twice = nums[x] * 2;
            if(twice > max && nums[x] != max){
                return -1;
            }
        }
        return pos;

    }
}
