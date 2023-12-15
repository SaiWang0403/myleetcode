import org.junit.Test;
//1929
public class ConcatenationofArray {
    @Test
    public void test(){
        int[] nums={1,2,3};
        int[] res=getConcatenation(nums);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] res=new int[len*2];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
            res[i+len]=nums[i];
        }
        return res;
    }
}
