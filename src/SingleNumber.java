import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

//136
public class SingleNumber {
    //1^1 =0 0^0=0 1^0=1
    //任何一个数异或0都是任何一个数
    @Test
    public void test(){
        int[] arr={4, 1, 2, 1, 2};
        int res=singleNumber(arr);
        System.out.println(res);
    }

    public int singleNumber(int[] arr){
        int result=0;
        for (int num : arr){
           result= result^num;
        }
        return result;
    }


//    public int singleNumber2(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsKey(nums[i])) {
//                map.put(nums[i],1);
//            }
//            else {
//                map.put(nums[i],map.get(nums[i]) + 1);
//            }
//        }
//        for ( Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//            if (map.get(key) == 1) {
//                return key;
//            }
//        }
//        return -1;
//    }
}
