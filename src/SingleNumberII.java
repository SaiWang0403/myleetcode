import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
//137
public class SingleNumberII {
    @Test
    public void test(){
        int[] nums={2,2,3,2};
        int res=singleNumber(nums);
        System.out.println(res);
    }

    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
