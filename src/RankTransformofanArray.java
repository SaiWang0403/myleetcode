import org.junit.Test;
//1331
import java.util.Arrays;
import java.util.HashMap;

public class RankTransformofanArray {
    @Test
    public void test(){
        int[] arr={40,10,20,30};
        int[] res=arrayRankTransform(arr);
        for(int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] array= Arrays.copyOf(arr,arr.length);
        Arrays.sort(array);
        int k=1;
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i]))
                map.put(array[i],k++);
        }
        int[] result=new int[array.length];
        for(int i=0;i<arr.length;i++)
            result[i]=map.get(arr[i]);
        return result;
    }
}
