import org.junit.Test;
//1122
import java.util.TreeMap;

public class RelativeSortArray {
    @Test
    public void test(){
        int[] arr1={2,2,4,1,1,9};
        int[] arr2={2,1,4};
        int[] arr=relativeSortArray(arr1,arr2);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n : arr1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int i = 0;
        for(int n : arr2) {
            for(int j = 0; j < map.get(n); j++) {
                arr1[i++] = n;
            }
            map.remove(n);
        }
        for(int n : map.keySet()){
            for(int j = 0; j < map.get(n); j++) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }
}
