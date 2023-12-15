import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class findDisapperedNumber {
//448
    //nums[i] is in the range [1, n]
    @Test
    public void test(){
        int[] nums={2,2,4,2};
        System.out.println(finddisapper(nums));
    }

    public List<Integer> finddisapper(int[] nums){
        int n=nums.length;
        for (int num:nums){
            int x=(num-1 )%n;
            nums[x]+=n;
        }
        List<Integer> res=new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            if(nums[i]<=n){
                res.add(i+1);
            }
        }
        return res;
    }

}
