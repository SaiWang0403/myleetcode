import org.junit.Test;
//724
public class FindPivotIndex {
    @Test
    public void test(){
        int[] nums={1,7,3,6,5,6};
        int res=pivotIndex(nums);
        System.out.println(res);
    }

    public int pivotIndex(int[] nums) {
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int left=0;
        for(int i=0;i<nums.length;i++){

            if(left*2==sum-nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
