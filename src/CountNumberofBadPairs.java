import org.junit.Test;
//2364
import java.util.HashMap;

public class CountNumberofBadPairs {
    @Test
    public void test(){
        int[] nums={4,1,3,3};
        long res=countBadPairs(nums);
        System.out.println(res);
    }


    public long countBadPairs(int[] a) {
        long cnt=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<a.length;i++){
            //j-i 如果！=nums【j】-nums【i】  那么就是bad pair 可以转化成 j-nums【j】如果！=i-nums【i】 那么就是bad pair
            //所以说 j-nums【j】如果=i-nums【i】 那么就是good pair
            //那么 用map 记录下i-nums【i】  如果之后还有这个数 那么就说明有j-nums【j】 就还有good pair
            int prev= mp.getOrDefault(i-a[i],0);
            //i这个位置的所有pair数量就是i  要减去好的pair的数量 剩下的就是bad pair的数量
            cnt+= i- prev;
            mp.put(i-a[i],prev+1);
        }
        return cnt;
    }
}
