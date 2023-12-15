import org.junit.Test;
//2148
import java.util.Arrays;
import java.util.HashMap;

public class CountElementsWithStrictlySmallerandGreaterElements {
    @Test
    public void test(){
        int[] nums={11,2,7,15};
        int res=countElements(nums);
        System.out.println(res);
    }

    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int N = nums.length;
        if(nums[0] == nums[N-1])
            return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
            map.put(i,map.getOrDefault(i,0)+1);
        for(int i : map.keySet())
            if(i > nums[0] && i < nums[N-1])
                count += map.get(i);
        return count;
    }

}
