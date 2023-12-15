import org.junit.Test;
//2367
import java.util.HashSet;
import java.util.Set;

public class NumberofArithmeticTriplets {
    @Test
    public void test(){
        int[] nums={0,1,4,6,7,10};
        int diff=3;
        int res=arithmeticTriplets(nums,diff);
        System.out.println(res);
    }

    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> list = new HashSet<>();
        for(int a : nums){
            if(list.contains(a-diff) && list.contains(a-diff*2)) count++;
            list.add(a);
        }
        return count;
    }
}
