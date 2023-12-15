import org.junit.Test;
//1394
import java.util.HashMap;

public class FindLuckyIntegerinanArray {
    @Test
    public void test(){
        int[] arr={2,2,3,4};
        int res=findLucky(arr);
        System.out.println(res);
    }

    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int res=-1;
        for(int key :map.keySet()){
            if(key==map.get(key)){
                res=key;
            }
        }
        return res;
    }
}
