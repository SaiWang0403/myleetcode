import org.junit.Test;
//2404
import java.util.HashMap;

public class MostFrequentEvenElement {
    @Test
    public void test(){
        int[] nums={0,1,2,2,4,4,1};
        int res=mostFrequentEven(nums);
        System.out.println(res);
    }

    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxFreq = 0;
        int element = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                int curr = map.getOrDefault(nums[i],0)+1;
                map.put(nums[i],curr);
                if(curr > maxFreq  || (curr == maxFreq && nums[i]<element)){
                    maxFreq = curr;
                    element = nums[i];
                }
            }
        }

        return maxFreq==0 ? -1 : element;
    }
}
