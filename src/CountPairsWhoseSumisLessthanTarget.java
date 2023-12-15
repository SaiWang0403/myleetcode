import org.junit.Test;
//2824
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumisLessthanTarget {
    @Test
    public void test(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-6);
        list.add(2);
        list.add(5);
        list.add(-2);
        list.add(-7);
        list.add(-1);
        list.add(3);
        int target=-2;
        int res=countPairs(list,target);
        System.out.println(res);
    }

    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums); // sort the vector nums
        int count = 0; // variable to store the count
        int left = 0; // variable to store the left
        int right = nums.size()-1; // variable to store the right
        while(left < right){ // loop until left is less than right
            if(nums.get(left) + nums.get(right) < target){ // if nums[left] + nums[right] is less than target
                count += right-left; // update the count
                left++; // increment the left
            }
            else{ // else
                right--; // decrement the right
            }
        }
        return count; // return the count

    }
}
