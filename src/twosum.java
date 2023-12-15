import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
//无序
public class twosum {
//1
    @Test
    public void test(){
        int[] nums= {2,7,11,15};
        int target =17;
        System.out.println(Arrays.toString(twoSum1(nums,target)));
    }

    public int[] twoSum(int[] numbers,int target){
            for (int i=0;i<numbers.length;i++){
                for (int j=i+1;j<numbers.length;j++){
                    if(numbers[i]+numbers[j]==target){
                        return new int[] {i,j};
                    }
                }
            }
            return null;
    }

    public int[] twoSum1(int[] numbers, int target) {
            HashMap<Integer,Integer> indexmap=new HashMap<>();
            for (int i=0;i<numbers.length;i++){
                int requirednumber=target-numbers[i];
                if(indexmap.containsKey(requirednumber)){
                    int res[]={indexmap.get(requirednumber),i};
                    return res;
                }
                indexmap.put(numbers[i],i);
            }
            return null;
    }


}
