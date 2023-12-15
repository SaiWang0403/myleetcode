import org.junit.Test;
//2176
public class CountEqualandDivisiblePairsinanArray {
    @Test
    public void test(){
        int[] nums={3,1,2,2,2,1,3};
        int k=2;
        int res=countPairs(nums,k);
        System.out.println(res);
    }

    public int countPairs(int[] nums, int k) {

        int res=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((i*j)%k==0 && nums[i]==nums[j]){
                    res++;
                }
            }
        }
        return res;
    }
}
