import org.junit.Test;
//2574
public class LeftandRightSumDifferences {
    @Test
    public void test(){
        int[] nums={10,4,8,3};
        int[] res=leftRightDifference(nums);
        for (int i:res){
            System.out.println(i);
        }
    }

    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        left[0]=0;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        int[] right=new int[nums.length];
        right[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        int[] res=new int[nums.length];
        for(int i=0;i<res.length;i++){
            res[i]=Math.abs(left[i]-right[i]);
        }
        return res;
    }
}
