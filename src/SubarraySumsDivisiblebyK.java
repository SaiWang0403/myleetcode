import org.junit.Test;
//974
import java.util.HashMap;

public class SubarraySumsDivisiblebyK {
    @Test
    public void test(){
        int[] nums={-5,2,9};
        int k=2;
        int res=subarraysDivByK(nums,k);
        System.out.println(res);
    }

    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int result=0;
        map.put(0,1);
        int sum=0,rem=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem=sum%k;
            if(rem<0)
                rem+=k;
            if(map.containsKey(rem)){
                result+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else
                map.put(rem,1);
        }
        return result;
    }

}
