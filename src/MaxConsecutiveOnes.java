import org.junit.Test;
//485
public class MaxConsecutiveOnes {

    @Test
    public void test(){
        int[] nums={1,1,0,1,1,1};
        int res=findMaxConsecutiveOnes(nums);
        System.out.println(res);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        for (int i = 0; i < nums.length; i++){
            int newOnes = 0;
            while (i < nums.length && nums[i] == 1){
                newOnes++;
                i++;
            }
            maxOnes = Math.max(maxOnes, newOnes);
        }
        return maxOnes;
    }
}
