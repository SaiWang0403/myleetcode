import org.junit.Test;
//713
public class SubarrayProductLessThanK {
    @Test
    public void test(){
        int[] nums={10,5,2,6};
        int k=100;
        int res=numSubarrayProductLessThanK(nums,k);
        System.out.println(res);
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res=0,left=0,sum=1;
        if (k <= 1) return 0;
        for(int right=0;right<nums.length;right++){
            sum*=nums[right];
            while(sum>=k ){
                sum=sum/nums[left++];
            }
            res+=right-left+1;

        }
        return res;
    }

}
