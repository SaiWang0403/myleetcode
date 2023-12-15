import org.junit.Test;
//896
public class MonotonicArray {
    @Test
    public void test(){
        int nums[]={1,3,2};
        boolean res=isMonotonic(nums);
        System.out.println(res);
    }

    public boolean isMonotonic(int[] nums) {
        int len=nums.length;

        if(len<2)
            return true;
        boolean asc=nums[0]<nums[len-1];

        for(int i=0;i<len-1;i++)
            if(nums[i]==nums[i+1]) continue;
            else if(asc!=(nums[i]<nums[i+1]))
                return false;

        return true;
    }
}
