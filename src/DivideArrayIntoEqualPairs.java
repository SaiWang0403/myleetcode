import org.junit.Test;
//2206
import java.util.HashSet;
import java.util.Set;

public class DivideArrayIntoEqualPairs {
    @Test
    public void test(){
        int[] nums={3,2,3,2,2,2};
        boolean res=divideArray(nums);
        System.out.println(res);
    }

    public boolean divideArray(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                seen.remove(num);
            }
        }
        return seen.isEmpty();
    }
}
