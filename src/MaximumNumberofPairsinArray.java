import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
//2341
public class MaximumNumberofPairsinArray {
    @Test
    public void test(){
        int[] nums={1,3,2,1,3,2,2};
        int[] res=numberOfPairs(nums);
        for (int i:res){
            System.out.println(i);
        }
    }

    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int len=nums.length;
        int res=0;
        for(int value:map.values()){
            while(value>=2){
                res++;
                value-=2;
                len-=2;
            }
        }
        int[] arr=new int[2];
        arr[0]=res;
        arr[1]=len;
        return arr;
    }
}
