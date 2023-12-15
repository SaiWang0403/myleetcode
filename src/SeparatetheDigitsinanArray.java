import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SeparatetheDigitsinanArray {

    @Test
    public void test(){
        int[] nums={13,25,83,77};
        int[] res=separateDigits(nums);
        for (int n:res){
            System.out.println(n);
        }
    }


    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i : nums) {
            // for every number in nums,
            // we would add digit by digit to this new list
            List<Integer> list = new ArrayList<>();
            while (i > 0) {
                // get the last digit, add to first position
                list.add(0, i % 10);
                i /= 10;     // get rid of last digit
            }
            // add all the digits in answer list
            ans.addAll(list);
        }

        // return the answer list as an array
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
