import org.junit.Test;
//414
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    @Test
    public void test(){
        int[] arr={2,2,3,1};
        int res=thirdMax(arr);
        System.out.println(res);

    }


    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=1; i<=3; i++){
            int max = Integer.MIN_VALUE;
            int pos = -1;
            for (int j=0; j<nums.length; j++){
                if (nums[j] >= max && !set.contains(nums[j])){
                    max = nums[j];
                    pos = j;
                }
            }
            if (pos != -1)
                set.add(max);
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int item : set){
            max = java.lang.Math.max(item, max);
            min = java.lang.Math.min(item, min);
        }
        return set.size()==3 ? min : max;
    }
}
