import org.junit.Test;
//1636
import java.util.*;

public class SortArraybyIncreasingFrequency {
    @Test
    public void test(){
        int[] nums={4,5,6,6};
        int[] res=frequencySort(nums);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int n : nums) {
            ans.add(n);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Collections.sort(ans,(a,b)->{
            if(map.get(a)==map.get(b)){
                return b-a;
            }
            return map.get(a)-map.get(b);
        });


        return ans.stream().mapToInt(i -> i).toArray(); // O(n)
    }
}
