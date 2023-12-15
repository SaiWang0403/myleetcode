import org.junit.Test;
//260
import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {
    @Test
    public void test(){
        int[] nums={1,2,1,3,2,5};
        int[] res=singleNumber(nums);
        for (int i:res){
            System.out.println(i);
        }
    }

    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] res=new int[2];
        int j=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                res[j++]=entry.getKey();
            }
        }
        return res;
    }
}
