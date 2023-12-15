import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofMultipleArrays {

    @Test
    public void test(){
        int[][] nums={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> res=intersection(nums);
        System.out.println(res);
    }


    public List<Integer> intersection(int[][] nums) {

        List<Integer> ans = new ArrayList<>();

        int[] count  = new int[1001];

        for(int[] arr : nums){
            for(int i : arr){
                count[i]++;
            }
        }

        for(int i=0;i<count.length;i++){
            if(count[i]==nums.length){
                ans.add(i);
            }
        }

        return ans;
    }
}
