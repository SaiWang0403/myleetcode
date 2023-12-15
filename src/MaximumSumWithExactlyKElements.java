import org.junit.Test;
//2656
public class MaximumSumWithExactlyKElements {
    @Test
    public void test(){
        int[] nums={1,2,3,4,5};
        int k=3;
        int res=maximizeSum(nums,k);
        System.out.println(res);
    }

    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int res=0;
        for(int j=0;j<k;j++){
            res+=max+j;
        }
        return res;
    }
}
