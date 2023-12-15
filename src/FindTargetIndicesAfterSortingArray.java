import org.junit.Test;
//2089
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    @Test
    public void test(){
        int[] nums={1,2,5,2,3};
        int target=2;
       List res=targetIndices(nums,target);
        System.out.println(res);

    }

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}
