import org.junit.Test;
//1748
import java.util.HashMap;
import java.util.Map;

public class SumofUniqueElements {
    @Test
    public void test(){
        int[] nums={1,2,3,2};
        int res=sumOfUnique(nums);
        System.out.println(res);
    }

    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()==1){
                count+=entry.getKey();
            }
        }
        return count;
    }
}
