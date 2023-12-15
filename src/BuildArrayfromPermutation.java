import org.junit.Test;
//1920
public class BuildArrayfromPermutation {
    @Test
    public void test(){
        int[] nums={0,2,1,5,3,4};
        int[] res=buildArray(nums);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] buildArray(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[nums[i]];
        }
        return res;
    }
}
