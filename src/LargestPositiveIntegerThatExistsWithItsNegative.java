import org.junit.Test;
//2441
import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    @Test
    public void test(){
        int[] nums={-1,2,-3,3};
        int res=findMaxK(nums);
        System.out.println(res);
    }

    public int findMaxK(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int res=-1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(-nums[i]) &&Math.abs(nums[i])>res){
                res=Math.abs(nums[i]);
            }
            set.add(nums[i]);
        }
        return res;

    }
}
