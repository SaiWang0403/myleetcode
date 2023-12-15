import org.junit.Test;
//1207
import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
    @Test
    public void test(){
        int[] arr={1,2,2,1,1,3};
        boolean res=uniqueOccurrences(arr);
        System.out.println(res);
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:map.values()){
            if(!set.add(i)){
                return false;
            }
        }
        return true;
    }
}
